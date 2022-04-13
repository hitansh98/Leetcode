class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        
        int[] dx = new int[]{0,1,0,-1};
        int[] dy = new int[]{1,0,-1,0};
        
        int[][] visited = new int[m][n];
        
        int temp = 0;
        int count = 0;
        
        List<Integer> al = new ArrayList<Integer>();
        
        int currx = 0;
        int curry = 0;
        
        while(count<m*n){
            
            visited[currx][curry] = 1;
            count++;
            al.add(matrix[currx][curry]);
            
            int nex = currx + dx[temp%4];
            int ney = curry + dy[temp%4];
            
            if(isArrayOOB(matrix, nex, ney) || visited[nex][ney] == 1){
                temp++;
                nex = currx + dx[temp%4];
                ney = curry + dy[temp%4];
            }
            
            currx = nex;
            curry = ney;
        }
        
        return al;
    }
    
    public boolean isArrayOOB(int[][] mat, int i, int j){
        return (i<0 || j<0 || i>=mat.length || j>=mat[0].length);
    }
}