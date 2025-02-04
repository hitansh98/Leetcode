class Solution {
    public int maxAscendingSum(int[] nums) {
        int maxTillNow = nums[0];
        int sum = nums[0];
        for(int i=1;i<nums.length;i++) {
            if(nums[i] <= nums[i-1]) {
                sum = 0;
            }
            sum += nums[i];
            maxTillNow = Math.max(sum, maxTillNow);
        }

        return maxTillNow;
    }
}