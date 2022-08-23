class Solution {
    public int maxProfit(int[] prices) {
        int buy = 0, sell = 1;
        int diff = 0;
        for(int i=1; i<prices.length;i++){
            diff = Math.max(diff, prices[sell]-prices[buy]);
            if(prices[sell]<prices[buy]){
                buy=sell;
            }
            sell++;
            
        }
        
        return diff;
    }
}