class Solution {
    public int maxProfit(int[] prices) {
        int[] ahead = new int[2];
        int[] curr = new int[2];
        ahead[0] = ahead[1] = 0;
        // return helper(prices, 0, prices.length-1, dp);
        
        
        for(int index = prices.length-1; index>=0;index--){
            for(int buy = 0; buy<2; buy++){
                if(buy==1){
                    curr[buy] =  Math.max(-prices[index] + ahead[0], 0 + ahead[1]);
                }
                else{
                    curr[buy] =  Math.max(prices[index] + ahead[1], 0 + ahead[0]);    
                }
                
                ahead = curr;
            }
        }
        
        
        return ahead[1];
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