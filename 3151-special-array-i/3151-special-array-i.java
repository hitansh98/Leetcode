class Solution {
    public boolean isArraySpecial(int[] nums) {
        int n = nums.length;
        if(n == 1) return true;

        int diff = 0;
        for(int i=1;i<n;i++) {
            diff = nums[i] - nums[i-1];
            if(diff % 2 == 0) return false;
        }

        return true;
    }


}