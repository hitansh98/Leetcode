class Solution {
    public boolean isAnagram(String s, String t) {
        char[] arr1 = new char[26];
        if(s.length() !=t.length()){
            return false;
        }
        
        for(int i=0;i<s.length();i++){
            arr1[s.charAt(i) - 'a']++;
            arr1[t.charAt(i) - 'a']--;
        }
        
        for(int i=0;i<26;i++){
            if(arr1[i]!=0){
                return false;
            }
        }
        
        return true;
    }
}