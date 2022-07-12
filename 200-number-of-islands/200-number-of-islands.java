class Solution {
    public int numIslands(char[][] grid) {
        int count = 0;
        
        int a = grid.length;
        
        int b = grid[0].length;
        if(a==0 || b==0) return 0;
        
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                if(grid[i][j]=='1'){
                    numIslandsHelper(grid, i, j);
                    count++;
                }
            }
        }
        
        return count;
    }
    
    public void numIslandsHelper(char[][] grid, int a, int b){
        if(a<0 || b<0 || a>=grid.length || b>=grid[0].length || grid[a][b] != '1'){
            return;
        }
        
        grid[a][b]='2';
        
        numIslandsHelper(grid, a+1, b);
        numIslandsHelper(grid, a-1, b);
        numIslandsHelper(grid, a, b+1);
        numIslandsHelper(grid, a, b-1);
    }
}