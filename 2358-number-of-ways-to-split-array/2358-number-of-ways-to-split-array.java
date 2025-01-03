class Solution {
    public int waysToSplitArray(int[] nums) {
        int n = nums.length;
        long[] leftSums = new long[n];
        long[] rightSums = new long[n];

        for(int i=0;i<n;i++) {
            leftSums[i] += nums[i];
            if(i > 1){
                leftSums[i] += leftSums[i-1];
                rightSums[n-i-1] += nums[n-i] + rightSums[n-i];
            } else if(i == 1) {
                leftSums[i] +=  leftSums[i-1];
                rightSums[n-i-1] += nums[n-i] + rightSums[n-i];
            }         
            else {
                rightSums[n-i-1] = 0; 
            }
        }

        int result = 0;
        for(int i=0;i<n-1;i++){
            if(leftSums[i] >= rightSums[i]) {
                result++;
            }
        }

        return result;
    }
}