class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        
        int left = 0;
        int right = m-1;
        
        
        while(left<=right){
            int mid = left + (right-left)/2;
            
            if(matrix[mid][0]>target){
                right = mid-1;
            }
            
            else if(matrix[mid][n-1] < target){
                left = mid+1;
            }
            
            else{
                int nleft = 0;
                int nright = n-1;
                while(nleft<=nright){
                    int nmid = nleft + (nright-nleft)/2;
                    
                    if(matrix[mid][nmid] == target){
                        return true;
                    }
                    
                    else if(matrix[mid][nmid]>target){
                        nright = nmid-1;
                    }

                    else{
                        nleft = nmid+1;
                    }
                    
                    
                }
                
                return false;
            }
        }
        
        return false;
    }
}