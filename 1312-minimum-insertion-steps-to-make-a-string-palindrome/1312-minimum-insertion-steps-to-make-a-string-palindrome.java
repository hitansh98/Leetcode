class Solution {
    Integer[][] dp;
    public int minInsertions(String s) {
        int n = s.length();
        dp = new Integer[n+1][n+1];
        return helper(s, 0, n-1);
    }
    
    public int helper(String s, int left, int right){
        if(left>=right){
            return 0;
        }
        if(dp[left][right] != null){
            return dp[left][right];
        }
        
        if(s.charAt(left) == s.charAt(right)){
            return dp[left][right] = helper(s, left+1, right-1);
        }
        
        return dp[left][right] = 1 + Math.min(helper(s, left+1, right), helper(s, left, right-1));
        
    }
}