class Solution {
    Integer[][] dp;
    public int uniquePaths(int m, int n) {
        dp = new Integer[m+1][n+1];
        return solve(0, 0, m, n);
    }

    public int solve(int i, int j, int m, int n) {
        if(i == m-1 && j == n-1) {
            dp[i][j] = 1;
            return dp[i][j];
        }

        if(dp[i][j] != null) {
            return dp[i][j];
        }

        if(i==m-1) {
            dp[i][j] = solve(i, j+1, m, n);
            return dp[i][j];
        }

        if(j==n-1) {
            dp[i][j] = solve(i+1, j, m, n);
            return dp[i][j];
        }

        dp[i][j] = solve(i+1, j, m, n) + solve(i, j+1, m, n);
        return dp[i][j];
    }
}