class Solution {
    public int addDigits(int num) {
        while(num/10!=0){
            int counter = 0;
            while(num!=0){
                counter += num%10;
                num /= 10;
            }
            num = counter;
        }
        
        return num;
    }
}