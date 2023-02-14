class Solution {
    public String addBinary(String a, String b) {
        int carry = 0;
        int aLen = a.length()-1;
        int bLen = b.length()-1;
        
        String res = "";
        
        while(aLen>-1 || bLen>-1){
            int val1 = aLen>-1 ? Integer.valueOf(a.charAt(aLen--)-48) : 0;
            int val2 = bLen>-1 ? Integer.valueOf(b.charAt(bLen--)-48) : 0;
            int sum = val1+val2+carry;
            
            
            res = (sum%2) + res;
            // System.out.println(val1+" "+val2+" "+carry);
            carry = sum/2;
//             if(sum%2==1){
                // if(sum==1){
                //     carry = 0;
                // }
                // else if(sum==3){
                //     carry = 1;
                // }
                
//                 carry = sum/2;
                
//                 res = "1"+res;
//             }
//             else{
                // if(sum==0){
                //     carry = 0;
                // }
                // else if(sum==2){
                //     carry = 1;
                // }
                
//                 carry = sum/2;
                
//                 res = "0"+res;
//             }
            
            // if(aLen>-1){
            //     aLen--;
            // }
            // if(bLen>-1){
            //     bLen--;
            // }
        }
        
        if(carry==1){
            res = "1"+res;
        }
        
        return res;
    }
}