class Solution {
    public int longestPalindromeSubseq(String s) {
        int n = s.length();
        Integer[][] dp = new Integer[n][n];
        return solve(s, dp, 0, n-1);
    }
    
    public int solve(String s, Integer[][] dp, int start, int end){
        if(start == end) return 1;
        
        if(start > end) return 0;
        
        if(dp[start][end] != null){
            return dp[start][end];
        }
        
        if(s.charAt(start) == s.charAt(end)) return 2 + solve(s, dp, start+1, end-1);
        
        int leaveleft = solve(s, dp, start+1, end);
        int leaveRight = solve(s, dp, start, end-1);
         
        return dp[start][end] = Math.max(leaveleft, leaveRight);
    }
    
    
}