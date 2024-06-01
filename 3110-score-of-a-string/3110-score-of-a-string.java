class Solution {
    public int scoreOfString(String s) {
        int res = 0;
        char[] cArr = s.toCharArray();
        for(int i=0; i<cArr.length - 1; i++){
            if(cArr[i] - cArr[i+1] > 0){
                res += cArr[i] - cArr[i+1];
            } else {
                res += cArr[i+1] - cArr[i];
            }
        }
        
        return res;
    }
}