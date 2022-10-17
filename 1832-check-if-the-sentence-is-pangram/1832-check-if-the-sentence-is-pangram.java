class Solution {
    public boolean checkIfPangram(String sentence) {
        int[] cArr = new int[26];
        
        for(char c: sentence.toCharArray()){
            cArr[c-'a']++;
        }
        
        for(int i: cArr){
            if(i==0) return false;
        }
        
        return true;
    }
}