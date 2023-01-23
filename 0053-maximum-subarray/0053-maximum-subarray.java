class Solution {
    public int maxSubArray(int[] nums) {
        
        
        //Kadane's Algorithm to find max sum subarray
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        
        for(int num: nums){
            sum = sum+num;
            maxSum = Math.max(sum, maxSum);
            
            if(sum<0){
                sum = 0;
            }
        }
        
        return maxSum;
    }
}