class Solution {
    public int maxProfit(int[] prices) {
        int[][] dp = new int[prices.length+1][2];
        dp[prices.length][0] = dp[prices.length][1] = 0;
        // return helper(prices, 0, prices.length-1, dp);
        
        
        for(int index = prices.length-1; index>=0;index--){
            for(int buy = 0; buy<2; buy++){
                if(buy==1){
                    dp[index][buy] =  Math.max(-prices[index] + dp[index+1][0], 0 + dp[index+1][1]);
                }
                else{
                    dp[index][buy] =  Math.max(prices[index] + dp[index+1][1], 0 + dp[index+1][0]);    
                }
            }
        }
        
        
        return dp[0][1];
    }
    
    
    public int helper(int[] prices, int index, int buy, int[][] dp){
        //base case
        
        if(dp[index][buy]!=0){
            return dp[index][buy];
        }
        
        if(index<0){
            return 0;
        }
        //if buy
        if(buy==1){
            dp[index][buy] =  Math.max(-prices[index] + dp[index+1][0], 0 + dp[index+1][1]);
        }
        
        //if sell
        else{
            dp[index][buy] =  Math.max(prices[index] + dp[index+1][1], 0 + dp[index+1][0]);    
        }
        
        return dp[index][buy];
        
    }
}