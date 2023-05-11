class Solution {
    Integer[][] dp;
    public int maxUncrossedLines(int[] nums1, int[] nums2) {
        dp = new Integer[nums1.length + 1][nums2.length + 1];
        return helper(nums1, nums2, nums1.length, nums2.length);
    }
    
    public int helper(int[] nums1, int[] nums2, int ind1, int ind2){
        if(ind1==0 || ind2==0){
            return 0;
        }
        
        if(dp[ind1][ind2] != null){
            return dp[ind1][ind2];
        }
        
        if(nums1[ind1-1] == nums2[ind2-1]){
            return 1 + helper(nums1, nums2, ind1-1, ind2-1);
        }
        
        return dp[ind1][ind2] = Math.max(helper(nums1, nums2, ind1-1, ind2), helper(nums1, nums2, ind1, ind2-1));
    }
}