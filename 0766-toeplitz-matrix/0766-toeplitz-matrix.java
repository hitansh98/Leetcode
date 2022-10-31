class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        boolean flag1 = true;
        boolean flag2 = true;
        for(int i=0;flag1 && flag2 && i<m;i++){
            flag1 = check(matrix, i, 0, matrix[i][0]);
        }
        
        for(int j=1;flag1 && flag2 && j<n;j++){
            flag2 = check(matrix, 0, j, matrix[0][j]);
        }
        
        return flag1 && flag2;
    }
    
    public boolean check(int[][] arr, int i, int j, int val){
        if(i>=arr.length || j>= arr[0].length){
            return true;
        } 
        
        return arr[i][j]==val && check(arr, i+1, j+1, val);
    }
}