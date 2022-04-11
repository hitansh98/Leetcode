class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        
        List<List<Integer>> al = new ArrayList<List<Integer>>(m); 
        for(int i=0;i<m;i++){
            List<Integer> internal = new ArrayList<Integer>(n);
            al.add(i,internal);
        }
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