class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] store = new int[26];
        
        for(char c: chars.toCharArray()){
            store[c-'a']++;
        }
        
        int count = 0;
        
        for(String word: words){
            int[] tempStore = store.clone();
            count += word.length();
            for(int j=0;j<word.length();j++){
                tempStore[word.charAt(j)-'a']--;
                if(tempStore[word.charAt(j) - 'a'] < 0){
                    count -= word.length();
                    break;
                }
            }
        }
        
        return count;
    }
}