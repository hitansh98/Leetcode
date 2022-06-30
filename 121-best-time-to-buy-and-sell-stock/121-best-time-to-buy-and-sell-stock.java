class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int left = 0;
        int right = 1;
        
        while(left<prices.length && right<prices.length){
            int diff = prices[right]-prices[left];
            
            if(diff>max){
                max = diff;
                right++;
                continue;
            }
            
            if(prices[right]<prices[left]){
                left=right;
                right++; 
                continue;
            }
            
            right++;
            
        }
        
        return max;
    }
}