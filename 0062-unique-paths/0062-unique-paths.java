class Solution {
    public int uniquePaths(int m, int n) {
        int [][] arr = new int [m+1][n+1];

        for(int i=m-1;i>=0;i--){
            for(int j=n-1;j>=0;j--){
                if(i==m-1 && j==n-1){
                    arr[i][j] = 1;
                } else {
                    int right = j+1 >= n ? 0 : arr[i][j+1];
                    int bottom = i+1 >= m ? 0 : arr[i+1][j];
                    
                    arr[i][j] = right + bottom;
                }   
            }
        }

        return arr[0][0];
    }
}