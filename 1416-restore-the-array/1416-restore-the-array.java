class Solution {
    int mod = 1000000007;
    Integer[] dp;
    public int numberOfArrays(String s, int k) {
        dp = new Integer[s.length() + 1];
        return helper(s, k, 0);
    }
    
    public int helper(String s, int k, int idx){
        if(idx == s.length()){
            return 1;
        }
        
        if(s.charAt(idx) == '0'){
            return 0;
        }
        
        if(dp[idx] != null) return dp[idx];
        
        long num = 0;
        int ans = 0;
        
        for(int j=idx;j<s.length();j++){
            num = num*10 + s.charAt(j) - '0';
            if(num > k) break;
            ans += helper(s, k, j+1);
            ans = ans%mod;
        }
        
        return dp[idx] = ans;
    }
}