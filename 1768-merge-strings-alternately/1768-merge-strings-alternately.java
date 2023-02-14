class Solution {
    public String mergeAlternately(String word1, String word2) {
        int first = 0;
        int second = 0;
        
        String res = "";
        
        while(first!=word1.length() || second!=word2.length()){
            if(first!=word1.length()){
                res+=word1.charAt(first++);
            }
            if(second!=word2.length()){
                res+=word2.charAt(second++);
            }
        }
        
        return res;
    }
}