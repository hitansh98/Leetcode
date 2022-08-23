class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        char[] cArr = new char[26];
        for(int i=0;i<s.length();i++){
            cArr[s.charAt(i)-'a']++;
            cArr[t.charAt(i)-'a']--;
        }
        
        for(int i=0;i<cArr.length;i++){
            if(cArr[i]!=0){
                return false;
            }
        }
        
        return true;
    }
}