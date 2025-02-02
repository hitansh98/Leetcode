class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        if (n == 1)
            return true;

        boolean foundPivot = false;
        for (int i = 1; i < n; i++) {
            if (nums[i] < nums[i - 1]) {
                if (foundPivot) {
                    return false;
                } else {
                    foundPivot = true;
                }
            }
        }

        if (foundPivot) {
            if (nums[0] < nums[n - 1]) {
                return false;
            }
        }

        return true;
    }
}