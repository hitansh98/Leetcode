class Solution {
    public boolean isPowerOfThree(int n) {
        if(n==0){ return false; }
        while(n!=0){
            int rem = n%3;
            if(rem!=0 && n!=1){
                return false;
            }
            n /= 3;
        }
        
        return true;
    }
}