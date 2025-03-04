class Solution {
    Integer[][] dp;
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        dp = new Integer[m][n];
        return solve(obstacleGrid, 0,0, m, n);
    }

    public int solve(int[][] obstacleGrid, int i, int j, int m, int n) {
        if(obstacleGrid[i][j] == 1) {
            return 0;
        }
        
        if(i == m-1 && j == n-1) {
            dp[i][j] = 1;
            return dp[i][j];
        }

        if(dp[i][j] != null) {
            return dp[i][j];
        }

        else if(i == m-1) {
            dp[i][j] = solve(obstacleGrid, i, j+1, m, n);
            return dp[i][j];
        }

        else if(j == n-1) {
            dp[i][j] = solve(obstacleGrid, i+1, j, m, n);
            return dp[i][j];
        }

        dp[i][j] = solve(obstacleGrid, i+1, j, m, n) + solve(obstacleGrid, i, j+1, m, n);
        return dp[i][j];
    }
}