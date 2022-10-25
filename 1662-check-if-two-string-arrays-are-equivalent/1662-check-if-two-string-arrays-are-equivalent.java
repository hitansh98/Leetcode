class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        // if(word1.length!=word2.length) return false;
        String res1 = "";
        String res2 = "";
        
        for(int i=0;i<word1.length;i++){
            res1 += word1[i];
        }
        
        for(int j=0;j<word2.length;j++){
            res2 += word2[j];
        }
        
        if(res1.equals(res2)){
            return true;
        }
        return false;
    }
}