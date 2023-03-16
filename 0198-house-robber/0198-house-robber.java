class Solution {
    Integer dp[][];
    public int rob(int[] nums) {
        //greedy approach
//         int oddSum = 0;
//         int evenSum = 0;
        
//         for(int i=0; i<nums.length;i++){
//             if(i%2==0){
//                 oddSum += nums[i];
//             }
//             else{
//                 evenSum += nums[i];
//             }
//         }
        
//         return Math.max(evenSum, oddSum);
        
        //recursion + memo
        dp = new Integer[nums.length][2];
        return profitCalculator(nums, 0, 1);
        
    }
    
    public int profitCalculator(int[] nums, int idx, int canRob){
        if(idx >= nums.length){
            return 0;
        }
        
        if(dp[idx][canRob]!=null){
            return dp[idx][canRob];
        }
        
        if(canRob==1){
            dp[idx][canRob] = Math.max( nums[idx] + profitCalculator(nums, idx+1, 0), profitCalculator(nums, idx+1, 1));
        }
        else{
            dp[idx][canRob] = profitCalculator(nums, idx + 1, 1);
        }
        
        return dp[idx][canRob];
    }
}