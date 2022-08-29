class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int ncol = matrix[0].length;
        int rmin = 0;
        int rmax = matrix.length-1;
        while(rmin<=rmax){
            int rmid = rmin + (rmax - rmin)/2;
            if(matrix[rmid][0]>target){
                rmax = rmid-1;
            }
            else if(matrix[rmid][ncol-1] < target){
                rmin = rmid+1;
            }
            else{
                int cmin = 0;
                int cmax = ncol-1;
                
                while(cmin<=cmax){
                    int cmid = cmin + (cmax-cmin)/2;
                    if(matrix[rmid][cmid] == target){
                        return true;
                    }
                    
                    else if(matrix[rmid][cmid] > target){
                        cmax = cmid-1;
                    }
                    else{
                        cmin = cmid+1;
                    }
                }
                
                return false;
            }
        }
        
        return false;
    }
}