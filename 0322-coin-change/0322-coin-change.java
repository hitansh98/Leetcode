class Solution {
    public int numCoins = 0;
    Integer[][] dp;
    
    public int coinChange(int[] coins, int amount) {
        dp = new Integer[coins.length+1][amount+1];
        for(int i=0;i<coins.length+1;i++){
            for(int j=0;j<amount+1;j++){
                dp[i][j] = -1;
            }
        }
        int result = helper(coins, amount, 0);
        
        
        return result==Integer.MAX_VALUE-1 ? -1: result;
    }
    
    public int helper(int[] coins, int amount, int curr){
        
        if((curr>=coins.length) || (amount<=0)){ //base case
            return (amount==0) ? 0 : Integer.MAX_VALUE-1;
        }
        
        if(dp[curr][amount]!=-1){
            return dp[curr][amount];
        }
        
        //choose this coin
        int takeTheCoin = 1 + Math.min(helper(coins, amount-coins[curr], curr), helper(coins, amount-coins[curr], curr+1));
        
        //do not choose this coin
        int doNotTakeTheCoin = 0 + helper(coins, amount, curr+1);
        
        dp[curr][amount] = Math.min(takeTheCoin, doNotTakeTheCoin);
        return dp[curr][amount];
    }
}