class Solution {
    
    int count = 0;
    int[][] dp;
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        dp = new int[obstacleGrid.length][obstacleGrid[0].length];
        
        for(int i=0;i<dp.length;i++){
            Arrays.fill(dp[i], -1);
        }
        // for(int i=0;i<dp.length;i++){
        //     System.out.println(Arrays.toString(dp[i]));
        // }
        
        int res = helper(obstacleGrid, 0, 0);
        
        return res;
    }
    
    
    public int helper(int[][] obstacleGrid, int x, int y){
        if(x<0 || y<0 || x >= obstacleGrid.length || y>=obstacleGrid[0].length || obstacleGrid[x][y]==1){
            return 0;
        }
        
        if(x==obstacleGrid.length-1 && y==obstacleGrid[0].length-1){
            return 1;
        }
        
        if(dp[x][y]==-1){
            dp[x][y] = helper(obstacleGrid, x+1, y) + helper(obstacleGrid, x, y+1);
        }
        
        return dp[x][y];
    }
}