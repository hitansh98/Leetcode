class KthLargest {
        
    PriorityQueue<Integer> pq;
    int kay;
    public KthLargest(int k, int[] nums) {
        pq = new PriorityQueue<Integer>(k, (a,b) -> a-b);
        kay = k;
        
        for(int i=0;i<nums.length;i++){
            add(nums[i]);
        }
    }
    
    public int add(int val) {
        if(pq.size()<kay){
            pq.offer(val);
        }
        else if(pq.peek() < val){
            pq.poll();
            pq.offer(val);
        }
        
        return pq.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */