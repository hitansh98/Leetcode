class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        
        int[][] test = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int x = (i*n + j + k)%(m*n);
                int x1 = x / n;
                int y1 = x % n;
                test[x1][y1] = grid[i][j];
            }
        }
        
        return (List) Arrays.asList(test);
    }
}