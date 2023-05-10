class Solution {
    public int[][] generateMatrix(int n) {
        int curr_x = 0;
        int curr_y = 0;
        int[][] res = new int[n][n];
        
        int temp = 0;
        int[][] dir = new int[][]{{0,1}, {1,0}, {0,-1}, {-1,0}};
        
        res[curr_x][curr_y] = 1;
        int count=1;
        
        int left = 0;
        int right = n-1;
        int top = 0;
        int bottom = n-1;
        
        while(count != n*n){
            int new_x = curr_x + dir[temp % 4][0];
            int new_y = curr_y + dir[temp % 4][1];
            
            if(new_y < left){
                bottom--;
                temp++;
            }
            
            else if(new_y > right){
                top++;
                temp++;
            }
            
            else if(new_x < top){
                left++;
                temp++;
            }
            
            else if(new_x > bottom){
                right--;
                temp++;
            }
            
            else{
                res[new_x][new_y] = ++count;
                curr_x = new_x;
                curr_y = new_y;
            }
        }
        
        return res;
    }
}