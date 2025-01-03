class Solution {
    public int waysToSplitArray(int[] nums) {
        int n = nums.length;
        long[] leftSums = new long[n];

        for(int i=0;i<n;i++) {
            leftSums[i] += nums[i];
            if(i != 0){
                leftSums[i] += leftSums[i-1];
            } 
        }

        int result = 0;
        for(int i=0;i<n-1;i++){
            if(leftSums[i] >= leftSums[n-1] - leftSums[i]) {
                result++;
            }
        }

        return result;
    }
}