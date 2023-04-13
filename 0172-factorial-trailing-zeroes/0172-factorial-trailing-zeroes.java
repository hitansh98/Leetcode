class Solution {
    public int trailingZeroes(int n) {
        int num = n - n%5;
        int count = 0;
        for(int i=5;i<=num;i+=5){
            int x = i;
            while(x%5==0){
                count++;
                x/=5;
            }
        }
        
        
        return count;
    }
}