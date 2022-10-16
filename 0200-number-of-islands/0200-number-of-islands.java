class Solution {
    public int numIslands(char[][] grid) {
        // int[][] visited = new int[grid.length][grid[0].length];
        int res = 0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1'){
                    res+=1;
                    dfs(grid, i, j);
                }
            }
        }
        
        return res;
    }
    
    public void dfs(char[][] grid, int i, int j){
        if(i<0 || j<0 || i>= grid.length || j>=grid[0].length || grid[i][j] != '1'){
            return;
        }
        
        
        grid[i][j]=2;
        
        dfs(grid, i+1, j);
        dfs(grid, i, j+1);
        dfs(grid, i-1, j);
        dfs(grid, i, j-1);

    }
}