class Solution {
    public int diagonalSum(int[][] mat) {
        // int[][] visited = new int[mat.length][mat.length];
        int sum = 0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat.length;j++){
                if(i==j){
                    // visited[i][j] = 1;
                    sum += mat[i][j];
                }
                
                if(i+j == mat.length - 1 && i!=j){
                    sum += mat[i][j];
                }
            }
        }
        
        return sum;
    }
}