class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int maxArea = 0;
        int[][] visited = new int[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1 && visited[i][j]==0){
                    maxArea = Math.max(maxArea, dfs(grid, visited, i, j));
                }
            }
        }
        
        return maxArea;
    }
    
    public int dfs(int[][] grid, int[][] visited, int i, int j){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || visited[i][j]==1 || grid[i][j]==0){
            return 0;
        }
        
        visited[i][j]=1;
        
        return 1+dfs(grid,visited, i+1, j)+dfs(grid,visited, i-1, j)+dfs(grid,visited, i, j+1)+dfs(grid,visited, i, j-1);
    }
}