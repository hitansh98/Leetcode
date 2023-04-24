class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>( (a,b)-> b-a );
        
        for(int stone: stones){
            pq.add(stone);
        }
        
        while(pq.size()>1){
            int a = pq.poll();
            int b = pq.poll();
            
            if(a!=b){
                pq.add((a-b));
            }
        }
        
        if(pq.isEmpty()){
            return 0;
        }
        return pq.poll();
    }
}