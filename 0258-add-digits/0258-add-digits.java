class Solution {
    public int addDigits(int num) {
        while(num/10!=0){
            int temp = num;
            int counter = 0;
            while(temp!=0){
                counter += temp%10;
                temp = temp/10;
            }
            num = counter;
        }
        
        return num;
    }
}