class Solution {
    public int maxProfit(int[] prices) {
        int minTillNow = Integer.MAX_VALUE;
        
        int maxProfitTillNow = 0;
        
        for(int stock: prices){
            minTillNow = Math.min(minTillNow, stock);
            maxProfitTillNow = Math.max(maxProfitTillNow, stock-minTillNow);
        }
        
        return maxProfitTillNow;
    }
}