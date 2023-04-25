class SmallestInfiniteSet {
    int ptr;
    int[] nums;
    
    public SmallestInfiniteSet() {
        nums = new int[1002];
        ptr = 1;
    }
    
    public int popSmallest() {
        int res = ptr;
        nums[ptr++] = -1;
        while(nums[ptr]!=0){
            ptr++;
        }
        return res;
    }
    
    public void addBack(int num) {
        if(nums[num] == -1){
            nums[num] = 0;
            if(ptr >= nums.length || ptr > num){
                ptr = num;
            }
        }
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */