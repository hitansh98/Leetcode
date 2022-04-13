class Solution {
    public int[][] generateMatrix(int n) {
        int[][] mat = new int[n][n]; //array will automatically initiate to 0's -- no need to maintain visited matrix. 
        
        //direction matrix. We access both these matrix using the same temp variable at a time.
        int[] dx = new int[]{0,1,0,-1};
        int[] dy = new int[]{1,0,-1,0};
        
        int count = 1;
        int temp = 0; //variable used to change direction.
        
        //Current Position Variables.
        int currx = 0;
        int curry = 0;
        
        //count==n*n condition because count variable is starting with 1.
        while(count<=n*n){
            
            mat[currx][curry] = count;
            count++;
            
            //Potential next position variables to evaluate travel/ no travel.
            int nex = currx + dx[temp%4];
            int ney = curry + dy[temp%4];
            
            //if we encounter conditions to not travel, simply change direction + modify new position variables. 
            //Call user-defined fn for Out of bounds condition in the first operand of the OR condition to avoid runtime error.
            if(isArrayOOB(mat, nex, ney) || mat[nex][ney] != 0){
                temp++;
                nex = currx + dx[temp%4];
                ney = curry + dy[temp%4];
            }
            
            //Update current position variables for next iteration
            currx = nex;
            curry = ney;
        
        }
        
        return mat;
        
    }
    
    //User-defined fn for avoiding Out of Bounds condition.
    public boolean isArrayOOB(int[][] mat, int i, int j){
        return (i<0 || j<0 || i>=mat.length || j>=mat.length);
    }
}