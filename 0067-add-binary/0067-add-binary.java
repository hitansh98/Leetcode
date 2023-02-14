class Solution {
    public String addBinary(String a, String b) {
        int carry = 0;
        int aLen = a.length()-1;
        int bLen = b.length()-1;
        
        String res = "";
        
        while(aLen>-1 || bLen>-1){
            int val1 = aLen>-1 ? Integer.valueOf(a.charAt(aLen--) - 48) : 0;
            int val2 = bLen>-1 ? Integer.valueOf(b.charAt(bLen--) - 48) : 0;
            int sum = val1+val2+carry;
            
            res = (sum%2) + res;
            carry = sum/2;
        }
        
        if(carry==1){
            res = "1"+res;
        }
        
        return res;
    }
}