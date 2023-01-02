class Solution {
    public boolean detectCapitalUse(String word) {
        char[] cArr = word.toCharArray();
        
        if(word.length()<2) return true;
        
        if(Character.isUpperCase(cArr[0]) && Character.isUpperCase(cArr[1])){
            for(int i=2;i<cArr.length;i++){
                if(Character.isLowerCase(cArr[i])) return false;
            }
        }
        else{
            for(int i=1;i<cArr.length;i++){
                if(Character.isUpperCase(cArr[i])) return false;
            }
        }
        
        return true;
    }
}