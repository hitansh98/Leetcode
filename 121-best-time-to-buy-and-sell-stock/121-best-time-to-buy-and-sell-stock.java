class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int left = 0;
        int right = 1;
        
        while(right<prices.length){
            int diff = prices[right]-prices[left];
            
            if(diff>max){
                max = diff;
            }
            
            else if(prices[right]<prices[left]){
                left=right;
            }
            
            right++;
            
        }
        
        return max;
    }
}