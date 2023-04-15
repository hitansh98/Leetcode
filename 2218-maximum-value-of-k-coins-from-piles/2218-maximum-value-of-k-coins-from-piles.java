class Solution {
    Integer[][] dp;
    public int maxValueOfCoins(List<List<Integer>> piles, int k) {
        int n = piles.size();
        dp = new Integer[n+1][k+1];
        
        return solve(piles, 0, k);
    }
    
    public int solve(List<List<Integer>> piles, int i, int k){
        if(i>=piles.size() || k<=0){
            return 0;
        }
        
        
        if(dp[i][k]!=null) return dp[i][k];
        
        int res = solve(piles, i+1, k);
        int curSum = 0;
        for(int j=1;j<=Math.min(piles.get(i).size(), k);j++){
            curSum += piles.get(i).get(j-1);
            res = Math.max(res, curSum + solve(piles, i+1, k-j));
        }
        
        return dp[i][k] = res;
    }
}