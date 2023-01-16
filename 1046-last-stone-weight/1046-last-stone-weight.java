class Solution {
    public int lastStoneWeight(int[] stones) {
        if(stones.length<2){
            return stones[0];
        }
        
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>((o1,o2) -> o2-o1);
        
        for(int i=0;i<stones.length;i++){
            pq.add(stones[i]);
        }
        
        while(pq.size()>1){
            int stone1 = pq.poll();
            int stone2 = pq.poll();
            
            int res = stone1-stone2;
            
            if(res!=0){
                pq.add(res);
            }
        }
        
        if(pq.size()==0) return 0;
        
        return pq.peek();
    }
}