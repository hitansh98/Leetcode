class Solution {
    public int climbStairs(int n) {
        
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);

        dp[0] = 0;
        dp[1] = 1;
        if(dp.length>2){
            dp[2] = 2;
        }
        
        for(int i=3;i<=n;i++){
            dp[i] = dp[i-2] + dp[i-1];
        }
        
        return dp[n];
    }
}