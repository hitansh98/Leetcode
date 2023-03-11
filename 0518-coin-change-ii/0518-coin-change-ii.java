class Solution {
    Integer[][] dp;
    public int change(int amount, int[] coins) {
        dp = new Integer[coins.length+1][amount+1];
        if(amount==0){
            return 1;
        }
        
        int res = helper(amount, coins, 0);
        return res;
    }
    
    public int helper(int amount, int[] coins, int curr){
        if(amount<=0 || curr >= coins.length){
            if(amount==0){
                return 1;
            }
            return 0;
        }
        
        
        if(dp[curr][amount] != null){
            return dp[curr][amount];
        }
        //take the coin
        int sum1 = helper(amount-coins[curr], coins, curr);
        
        
        //do not take the coin
        int sum2 = helper(amount, coins, curr+1);
        
        return dp[curr][amount] = sum1+sum2;
        
    }
}