class Solution {
    Integer[] dp;
    public int minCostClimbingStairs(int[] cost) {
        dp = new Integer[3];
        // return Math.min(helper(cost, 0), helper(cost, 1));
        
        dp[0] = 0;
        dp[1] = 0;
        
        for(int i=2;i<cost.length+1;i++){
            dp[2] = Math.min(cost[i-2] + dp[0], cost[i-1] + dp[1]);
            dp[0] = dp[1];
            dp[1] = dp[2];
        }
        
        return dp[2];
    }
    
//     public int helper(int[] cost, int idx){
//         if(idx>=cost.length){
//             return 0;
//         }
        
//         if(dp[idx]!=null) return dp[idx];
        
//         //jump 1
//         int j1 = cost[idx] + helper(cost, idx+1);
        
//         //jump 2
//         int j2 = cost[idx] + helper(cost, idx+2);
        
//         return dp[idx] = Math.min(j1, j2);
        
//     }
    
    
}