class Solution {
    public int maximum69Number (int num) {
        String str = ""+num;
        
        char[] cArr = str.toCharArray();
        
        for(int i=0;i<cArr.length;i++){
            if(cArr[i]=='6'){
                cArr[i] = '9';
                break;
            }
        }
        
        int res = Integer.parseInt(new String(cArr));
        return res;
    }
}