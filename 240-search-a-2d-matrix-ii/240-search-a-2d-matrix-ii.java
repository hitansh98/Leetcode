class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int mrow = matrix.length;
        int ncol = matrix[0].length;
        
        int rStart = 0;
        int cStart = ncol-1;
        while(rStart<mrow && cStart>=0){
            if(matrix[rStart][cStart] == target){
                return true;
            }
            
            else if(matrix[rStart][cStart] > target){
                cStart--;
            }
            else{
                rStart++;
            }
        }
        
        return false;
    }
}