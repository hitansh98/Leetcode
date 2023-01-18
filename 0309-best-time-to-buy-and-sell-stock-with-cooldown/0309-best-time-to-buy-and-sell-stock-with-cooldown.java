class Solution {
    public int maxProfit(int[] prices) {
        int[][] dp = new int[prices.length+1][2];
        for(int i=0;i<dp.length;i++){
            Arrays.fill(dp[i], -1);
        }
        return maxProfitUtil(prices, dp, 0, 1);
    }
    
    public int maxProfitUtil(int[] prices, int[][] dp, int index, int canBuy){
        
        if(index>=prices.length) return 0;
        
        if(dp[index][canBuy]!=-1){
            return dp[index][canBuy];  
        } 
        
        if(canBuy==1){
            dp[index][canBuy] = Math.max(-prices[index]+maxProfitUtil(prices, dp, index+1, 0), maxProfitUtil(prices, dp, index+1, 1));
        }
        else{
            dp[index][canBuy] = Math.max(prices[index] + maxProfitUtil(prices, dp, index+2, 1), maxProfitUtil(prices, dp, index+1, 0));
        }
        
        return dp[index][canBuy];
    }
}