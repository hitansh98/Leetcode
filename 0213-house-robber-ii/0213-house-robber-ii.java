class Solution {
    Integer[][][] dp;
    public int rob(int[] nums) {
        dp = new Integer[nums.length][2][2];
        // System.out.println("idx canRob robbedFirst dpval");
        return helper(nums, 0, 1, 0);
    }
    
    public int helper(int[] nums, int idx, int canRob, int robbedFirst){
        if(idx>=nums.length || (idx == nums.length - 1 && robbedFirst == 1)){
            return 0;
        }
        
        if(dp[idx][canRob][robbedFirst]!=null){
            return dp[idx][canRob][robbedFirst];
        }
        
        if(canRob == 1){
            if(idx == 0){
                dp[idx][canRob][robbedFirst] = Math.max(nums[idx] + helper(nums, idx + 1, 0, 1), helper(nums ,idx+1, 1, 0));
            }
            else{
                dp[idx][canRob][robbedFirst] = Math.max(nums[idx] + helper(nums, idx + 1, 0, robbedFirst), helper(nums, idx+1, 1, robbedFirst));    
            }
            
        }
        else{
            dp[idx][canRob][robbedFirst] = helper(nums, idx+1, 1, robbedFirst);
        }
        
        // System.out.println(idx+" "+canRob+" "+robbedFirst+" "+dp[idx][canRob]);
        return dp[idx][canRob][robbedFirst];
    }
}