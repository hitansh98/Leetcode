class Solution {
    public String breakPalindrome(String palindrome) {
        if(palindrome.length()==1){
            return "";
        }
        String res = "";
        char[] cArr = new char[]{'a','b'};
        boolean flag = false;
        for(int i=0;i<palindrome.length()/2;i++){
            if(palindrome.charAt(i)!='a'){
                int left = 0;
                while(left<i){
                    res+=palindrome.charAt(left);
                    left++;
                }
                res+=cArr[0];
                flag=true;
                int right = i+1;
                while(right<palindrome.length()){
                    res+=palindrome.charAt(right);
                    right++;
                }
                
                break;
            }
        }
        
        if(flag==false){
            int left = 0;
            while(left<palindrome.length()-1){
                res+=palindrome.charAt(left);
                left++;
            }
            res+=cArr[1];
        }

        
        
        return res;
    }
}