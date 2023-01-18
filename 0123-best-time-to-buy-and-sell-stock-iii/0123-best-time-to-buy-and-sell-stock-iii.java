class Solution {
    public int maxProfit(int[] prices) {
        int[][][] dp = new int[prices.length][2][3];
        
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[i].length;j++){
                Arrays.fill(dp[i][j], -1);
            }
        }
        
        return maxProfitUtil(prices, dp, 0, 1, 2);
    }
    
    
    public int maxProfitUtil(int[] prices, int[][][] dp, int index, int canBuy, int rem){
        
        if(rem==0){
            return 0;
        }
        
        if(index==prices.length){
            return 0;
        }
        
        if(dp[index][canBuy][rem]!=-1){
            return dp[index][canBuy][rem];
        }
        
        if(canBuy==1){
            
            dp[index][canBuy][rem] = Math.max((-prices[index] + maxProfitUtil(prices, dp, index+1, 0, rem)), maxProfitUtil(prices, dp, index+1, 1, rem));
        }
        else{
            dp[index][canBuy][rem] = Math.max((prices[index] + maxProfitUtil(prices, dp, index+1, 1, rem-1)), maxProfitUtil(prices, dp, index+1, 0, rem));
        }
        
        return dp[index][canBuy][rem];
    }
}