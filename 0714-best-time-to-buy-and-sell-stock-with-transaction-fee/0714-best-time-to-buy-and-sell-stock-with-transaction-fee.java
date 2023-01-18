class Solution {
    public int maxProfit(int[] prices, int fee) {
        int[][] dp = new int[prices.length+1][2];
        for(int i=0;i<dp.length;i++){
            Arrays.fill(dp[i], -1);
        }
        return maxProfitUtil(prices, dp, 0, 1, fee);
    }
    
    public int maxProfitUtil(int[] prices, int[][] dp, int index, int canBuy, int fee){
        
        if(index>=prices.length) return 0;
        
        if(dp[index][canBuy]!=-1){
            return dp[index][canBuy];  
        } 
        
        if(canBuy==1){
            dp[index][canBuy] = Math.max(-prices[index]+maxProfitUtil(prices, dp, index+1, 0, fee), maxProfitUtil(prices, dp, index+1, 1, fee));
        }
        else{
            dp[index][canBuy] = Math.max(prices[index]-fee+ maxProfitUtil(prices, dp, index+1, 1, fee), maxProfitUtil(prices, dp, index+1, 0, fee));
        }
        
        return dp[index][canBuy];
    }
}