class Solution {
    public int maxProfit(int[] prices) {
        // if(prices.length <2){
        //     return 0;
        // }
        int profitIfSoldToday = 0;
        int maximumPossibleProfit = 0;
        
        int leastSoFar = Integer.MAX_VALUE;
        
        // while( right < prices.length){
        //     if(prices[left] < prices[right]){
        //         int profit = prices[right] - prices[left];
        //         maxProfit = Math.max(maxProfit, profit);
        //     }
        //     else{
        //         left = right;
        //     }
        //     right += 1;
        // }
        
        for(int i=0;i<prices.length;i++){
            if(leastSoFar > prices[i]){
                leastSoFar = prices[i];
            }
            
            profitIfSoldToday = prices[i]-leastSoFar;
            if(maximumPossibleProfit < profitIfSoldToday ){
                maximumPossibleProfit = profitIfSoldToday;
            }
        }
        
        return maximumPossibleProfit;
    }
}