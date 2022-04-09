class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer> ();
        
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i], hm.getOrDefault(nums[i],0)+1);
        }
        // System.out.println(hm);
        PriorityQueue<Integer> pq = new PriorityQueue<Integer> (k, (a,b) -> hm.get(a) - hm.get(b) );
        
        for(int m : hm.keySet()){    
            if(pq.size()<k){
                pq.offer(m);
            }
            else if(hm.get((Integer)pq.peek()) < hm.get(m)){
                pq.poll();
                pq.offer(m);
            }
        }
        
        // System.out.println(pq);
        int[] fin = new int[pq.size()];
        
        for(int i=0;pq.size()>0;i++) {
            // System.out.println(pq.size()+" "+pq.peek());
            fin[i] = pq.poll();
        }
        
        return fin;
    }
}