class Solution {
    public int trailingZeroes(int n) {
        // O(n) sol
//         int num = n - n%5;
//         int count = 0;
//         for(int i=5;i<=num;i+=5){
//             int x = i;
//             while(x%5==0){
//                 count++;
//                 x/=5;
//             }
//         }
        
        
//         return count;
        
        
        // O(log5n) sol
        
        if(n<5){
            return 0;
        }
        
        int count = 0;
        int num = n- n%5;
        
        
        for(int i=5;i<=num;i*=5){
            count += num/i;
        }
        
        
        return count;
    }
}