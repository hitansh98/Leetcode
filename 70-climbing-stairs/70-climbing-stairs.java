class Solution {
    public int climbStairs(int n) {
        int[] A = new int[n+1];
        
        for(int i=0;i<=n;i++){
            A[i] = -1;
        }
        
        return climbStairsHelper(A, n);
    }
    
    public int climbStairsHelper(int[] A, int n){
        
        if(A[n] == -1){
            int r;
            
            if(n==0 || n==1 || n==2){
                r = n;
            }
        
            else{
                r = climbStairsHelper(A, n-1) + climbStairsHelper(A, n-2);
            }
            A[n] = r;
        }
        
        return A[n];
        
    }
}