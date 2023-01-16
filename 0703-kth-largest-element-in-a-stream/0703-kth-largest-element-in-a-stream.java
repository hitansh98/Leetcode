class KthLargest {

    PriorityQueue<Integer> pq;
    int k;
    
    public KthLargest(int k, int[] nums) {
        pq = new PriorityQueue<Integer>();
        this.k = k;
        
        for(int num: nums){
            this.add(num);
        }
    }
    
    public int add(int val) {
        pq.add(val);
        
        if(pq.size()>this.k){
            pq.poll();
        }
        
        return pq.peek();
        
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */