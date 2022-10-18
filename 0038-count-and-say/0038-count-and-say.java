class Solution {
    public String countAndSay(int n) {
        String digitString = "1";
        
        while(n-->1){
            char[] cArr = digitString.toCharArray();
            int count=1;
            digitString = "";
            for(int i=0;i<cArr.length;i++){
                if(i<cArr.length-1 && cArr[i]==cArr[i+1]){
                    count++;
                }
                else{
                    digitString += count+""+cArr[i];
                    count=1;
                }
            }
        }
        
        return digitString;
    }
}