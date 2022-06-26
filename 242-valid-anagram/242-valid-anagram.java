class Solution {
    public boolean isAnagram(String s, String t) {
        int[] alphaArray = new int[26];
        if(s.length() != t.length()){
            return false;
        }
        for(int i=0; i<s.length(); i++){
            alphaArray[s.charAt(i) - 'a'] = alphaArray[s.charAt(i) - 'a'] + 1;
            alphaArray[t.charAt(i) - 'a'] = alphaArray[t.charAt(i) - 'a'] - 1;
        }
        for(int i=0;i<26;i++){
            if(alphaArray[i]!=0){
                return false;
            }
        }
        
        return true;
        
    }
}