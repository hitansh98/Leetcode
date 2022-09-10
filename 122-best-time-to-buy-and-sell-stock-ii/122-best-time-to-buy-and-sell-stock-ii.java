class Solution {
    public int[][] dp;
    public int maxProfit(int[] prices) {
        dp = new int[prices.length][2];
        
        for (int i =0;i<prices.length;i++){
            for(int j=0;j<2;j++){
                dp[i][j] = -1;
            }
        }
        
        int result = profitHelper(prices, 0, 1);
        
        return result;
    }
    
    public int profitHelper(int[] prices, int index, int canBuy){
        if(index>=prices.length) return 0;
        
        // 
        int profit = 0;
        
        if(dp[index][canBuy]== -1){
            if(canBuy == 1){
                profit += Math.max(-prices[index]+profitHelper(prices, index+1, 0), profitHelper(prices, index+1, 1));

            }
            else{
                profit+= Math.max(prices[index] + profitHelper(prices, index+1, 1), profitHelper(prices, index+1, 0));
            }
            
            dp[index][canBuy] = profit;
        }
        
        else{
            profit = dp[index][canBuy];
        }
        
        return profit;
        
    }
}