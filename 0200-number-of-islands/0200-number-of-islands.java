class Solution {
    public int numIslands(char[][] grid) {
        int count = 0;
        int[][] visited = new int[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(visited[i][j]==0 && grid[i][j]=='1'){
                    count++;
                    dfs(grid, visited, i, j);
                }
            }
        }
        
        return count;
    }
    
    public void dfs(char[][] grid, int[][] visited, int i, int j){
        if(i<0|| i>=grid.length || j<0 || j>=grid[0].length|| visited[i][j] != 0 || grid[i][j] == '0'){
            return; 
        }
        
        
        visited[i][j] = 1;
        
        dfs(grid, visited, i+1, j);
        dfs(grid, visited, i-1, j);
        dfs(grid, visited, i, j+1);
        dfs(grid, visited, i, j-1);
    }
}