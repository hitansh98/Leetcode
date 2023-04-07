class Solution {
    int res;
    public int numEnclaves(int[][] grid) {
        res = 0;
        
        
        for(int i=0;i<grid.length;i++){
            floodFill(grid, i, 0);
            floodFill(grid, i, grid[0].length-1);
        }
        
        for(int j=0;j<grid[0].length;j++){
            floodFill(grid, 0, j);
            floodFill(grid, grid.length-1, j);
        }
        
        
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j] == 1){
                    dfs(grid, i, j);   
                }
            }
        }
        
        
        return res;
        
    }
    
    public void floodFill(int[][] grid, int i, int j){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j]==0){
            return;
        }
        
        grid[i][j] = 0;
        
        
        floodFill(grid, i+1, j);
        floodFill(grid, i-1, j);
        floodFill(grid, i, j+1);
        floodFill(grid, i, j-1);
    }
    
    public void dfs(int[][] grid, int i, int j){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j]==0){
            return;
        } 
        
        res++;
        grid[i][j] = 0;
        
        dfs(grid, i+1, j);
        dfs(grid, i-1, j);
        dfs(grid, i, j+1);
        dfs(grid, i, j-1);
    }
}