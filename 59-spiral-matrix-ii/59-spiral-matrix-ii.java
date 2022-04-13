class Solution {
    public int[][] generateMatrix(int n) {
        int[][] mat = new int[n][n];
        
        int[] dx = new int[]{0,1,0,-1};
        int[] dy = new int[]{1,0,-1,0};
        
        int count = 1;
        int temp = 0;
        
        int currx = 0;
        int curry = 0;
        
        while(count<=n*n){
            
            mat[currx][curry] = count;
            count++;
            
            int nex = currx + dx[temp%4];
            int ney = curry + dy[temp%4];
            // System.out.println(nex+" "+ney);
            if(isArrayOOB(mat, nex, ney) || mat[nex][ney] != 0){
                // System.out.println("change direction from: " +dx[temp%4]+" "+dy[temp%4]);
                temp++;
                // System.out.println("change direction to: " +dx[temp%4]+" "+dy[temp%4]);
                nex = currx + dx[temp%4];
                ney = curry + dy[temp%4];
            }
            
            currx = nex;
            curry = ney;
        
        }
        
        // System.out.println(temp+" "+count);
        
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n;j++){
        //         System.out.print(mat[i][j]+" ");
        //     }
        //     System.out.println();
        // }
        
        return mat;
        
    }
    
    public boolean isArrayOOB(int[][] mat, int i, int j){
        return (i<0 || j<0 || i>=mat.length || j>=mat.length);
    }
}