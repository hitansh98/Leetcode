class Solution {
    Integer[][] dp;
    public int minInsertions(String s) {
        dp = new Integer[s.length()][s.length()];
        return helper(s, 0, s.length()-1);
    }
    
    public int helper(String s, int i, int j){
        if(i>j) return 0; //base case
        
        if(dp[i][j] != null){
            return dp[i][j];
        }
        
        if(s.charAt(i) == s.charAt(j)){
            return dp[i][j] = helper(s, i+1, j-1);
        }
        
        return dp[i][j] = 1 + Math.min(helper(s, i+1, j), helper(s, i, j-1));
    }
}