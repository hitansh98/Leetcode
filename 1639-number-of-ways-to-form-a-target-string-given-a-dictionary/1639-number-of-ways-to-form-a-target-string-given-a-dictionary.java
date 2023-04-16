class Solution {
    Long[][] dp;
    int[][] freqCount;
    public int numWays(String[] words, String target) {
        dp = new Long[words[0].length()][target.length()];
        freqCount = new int[words[0].length()][26];
        
        for(int i=0;i<words.length;i++){
            for(int j=0;j<words[0].length();j++){
                int c = words[i].charAt(j) - 'a';
                freqCount[j][c]++;
            }
        }
        
        return (int) solve(words, target, 0, 0);
    }
    
    public long solve(String[] words, String target, int c, int t){
        if(t >= target.length()){
            return 1;
        }
        
        if(c >= words[0].length() || words[0].length() - c < target.length() - t) return 0;
        
        if(dp[c][t]!=null) return dp[c][t];
        
        long res = 0;
        
        // for(int idx = 0; idx < words.length;idx++){
        //     if(words[idx].charAt(c) == target.charAt(t)){
        //         res += solve(words, target, c + 1, t + 1)%1000000007;
        //     }
        // }
        res += (freqCount[c][target.charAt(t)-'a'] * solve(words, target, c+1, t+1))%1000000007;
        res += solve(words, target, c + 1, t)%1000000007; 
        
        return dp[c][t] = res%1000000007;
    }
}