class Solution {
    Integer[][] dp;
    public int maxSatisfaction(int[] satisfaction) {
        dp = new Integer[satisfaction.length][satisfaction.length];
        Arrays.sort(satisfaction);
        return helper(satisfaction, 0, 0);
    }
    
    public int helper(int[] satisfaction, int index, int timeElapsed){
        if(index>=satisfaction.length){
            return 0;
        }
        
        if(dp[index][timeElapsed]!=null){
            return dp[index][timeElapsed];
        }
        
        //take the val
        int takeVal = (timeElapsed+1)*satisfaction[index] + helper(satisfaction, index+1, timeElapsed+1);
        
        //dont take val
        int leaveVal = helper(satisfaction, index+1, timeElapsed);
        
        return dp[index][timeElapsed] = Math.max(takeVal, leaveVal);
    }
}