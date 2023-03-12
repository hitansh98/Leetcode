class Solution {
    Integer dp[][];
    public int uniquePaths(int m, int n) {
        dp = new Integer[m+1][n+1];
        
        return helper(0, 0, m, n);
        
    }
    
    public int helper(int i, int j, int m, int n){
        if(i<0 || i>m-1 || j<0 || j>n-1){
            return 0;
        }
        
        if(i==m-1 && j==n-1){
            return 1;
        }
        
        if(dp[i][j]!=null){
            return dp[i][j];
        }
        
        
        //goes right
        int r1 = helper(i, j+1, m, n);
        
        //goes down
        int r2 = helper(i+1, j, m, n);
        
        return dp[i][j] = r1 + r2;
    }
}