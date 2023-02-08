class Solution {
    Integer[] dp;
    public int jump(int[] nums) {
        dp = new Integer[nums.length];
        int res = helper(nums, 0);
        return res;
    }
    
    
    public int helper(int[] nums, int index){
        if(index>=nums.length-1){
            return 0;
        }
        
        if(dp[index]==null){
            int min = nums.length;
            for(int i=1;i<=nums[index];i++){
                min = Math.min(min, 1+helper(nums, index+i));
            }
            dp[index] = min;
        }
        
        
        return dp[index];
    }
}