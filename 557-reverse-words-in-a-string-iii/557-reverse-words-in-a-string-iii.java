class Solution {
    public String reverseWords(String s) {
        char[] ca = s.toCharArray();
        
        
        int start = 0, end = 0;
        
        for(;end < ca.length;end++){
            if(ca[end] == ' '){
                reverse(ca, start, end-1);
                start = end+1;
            }
        }
        
        reverse(ca, start, end-1);
        
        return new String(ca);
    }
    
    public void reverse(char[] arr, int start, int end){
        while(start<end){
            char temp = arr[start];
            arr[start++] = arr[end];
            arr[end--] = temp;
        }
    }
}