class Solution {
    public int maxProfit(int[] prices) {
        
        if(prices.length<2) return 0;
        
        int[][] dp = new int[prices.length+1][2];
        
        dp[prices.length][0] = 0;
        dp[prices.length][1] = 0;
        
        for(int i=prices.length-1;i>=0;i--){
            for(int canBuy=0;canBuy<2;canBuy++){
                if(canBuy==1){
                    dp[i][canBuy] = Math.max(-prices[i] + dp[i+1][0], dp[i+1][1]);
                }
                else{
                    dp[i][canBuy] = Math.max(prices[i] + dp[i+1][1], dp[i+1][0]);
                }
            }
        }
        
        return dp[0][1];
    }
    
//     public int calcMaxProfit(int[] prices, int canBuy, int index){
//         if(index>=prices.length){
//             return 0;
//         }
        
//         if(canBuy==1){
//             return Math.max(-prices[index] + calcMaxProfit(prices, 0, index+1), calcMaxProfit(prices, 1, index+1)); 
//         }
//         else{
//             return Math.max(prices[index] + calcMaxProfit(prices, 1, index+1), calcMaxProfit(prices, 0, index+1));
//         }
//     }
}