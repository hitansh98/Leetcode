class Solution {
    public int maxProfit(int[] prices) {
        int lowestTillNow = Integer.MAX_VALUE;
        int maxProfit=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i] < lowestTillNow){
                lowestTillNow = prices[i];
            }
            
            int profit = prices[i] - lowestTillNow;
            maxProfit = Math.max(profit, maxProfit);
        }
        
        return maxProfit;
    }
}