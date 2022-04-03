class Solution {
    public int[] A;
    public int climbStairs(int n) {
        A = new int[n+1];
        
        for(int i=0;i<=n;i++){
            A[i] = -1;
        }
        
        return climbStairsHelper(n);
    }
    
    public int climbStairsHelper(int n){
        
        if(A[n] == -1){
            int r;
            
            if(n==0 || n==1 || n==2){
                r = n;
            }
        
            else{
                r = climbStairsHelper(n-1) + climbStairsHelper(n-2);
            }
            A[n] = r;
        }
        
        return A[n];
        
    }
}