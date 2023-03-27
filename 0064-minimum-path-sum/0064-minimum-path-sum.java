class Solution {
    Integer[][] dp;
    public int minPathSum(int[][] grid) {
        dp = new Integer[grid.length][grid[0].length];
        return helper(0, 0, grid);
    }
    
    public int helper(int i, int j, int[][] grid){
        if(i>=grid.length || j>=grid[0].length){
            return Integer.MAX_VALUE - 101;
        }
        
        if(dp[i][j]!=null) return dp[i][j];
        
        if(i==grid.length-1 && j==grid[0].length-1){
            return dp[i][j] = grid[i][j];
        }
        
        
        int down = helper(i+1, j, grid);
        int right = helper(i, j+1, grid);
        
        return dp[i][j] = Math.min(grid[i][j] + right, grid[i][j] +  down);
    }
}