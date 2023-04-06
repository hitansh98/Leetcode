class Solution {
    int res;
    public int closedIsland(int[][] grid) {
        res = 0;
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++){
            floodFill(grid, visited, i, 0);
            floodFill(grid, visited, i, grid[0].length-1);
        }
        
        for(int j=0;j<grid[0].length;j++){
            floodFill(grid, visited, 0, j);
            floodFill(grid, visited, grid.length-1, j);
        }
        
//         for(int i=0;i<grid.length;i++){
//             System.out.println(Arrays.toString(grid[i]));
//         }
        
        
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j] == 0 && !visited[i][j]){
                    isClosed(grid, visited, i, j);
                    res++;
                }
            }
        }
        
        return res;
    }
    
    public void floodFill(int[][] grid, boolean[][] visited, int i, int j){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || visited[i][j] == true || grid[i][j] == 1){
            return;
        }
        
        visited[i][j] = true;
        grid[i][j] = 1;
        
        floodFill(grid, visited, i+1, j);
        floodFill(grid, visited, i-1, j);
        floodFill(grid, visited, i, j+1);
        floodFill(grid, visited, i, j-1);
    }
    
    public void isClosed(int[][] grid, boolean[][] visited, int i, int j){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || visited[i][j] == true || grid[i][j] == 1){
            return;
        }
        
        visited[i][j] = true;
        
        isClosed(grid, visited, i+1, j);
        isClosed(grid, visited, i-1, j);
        isClosed(grid, visited, i, j-1);
        isClosed(grid, visited, i, j+1);
    }
}