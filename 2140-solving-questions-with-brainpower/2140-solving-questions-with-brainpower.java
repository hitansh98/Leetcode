class Solution {
    Long[] dp;
    public long mostPoints(int[][] questions) {
        // int maxCool = 0;
        // for(int i=0;i<questions.length;i++){
        //     maxCool = Math.max(questions[i][1], maxCool);
        // }
        dp = new Long[questions.length + 1];
        return helper(questions, 0);
    }
    
    public long helper(int[][] questions, int idx){
        if(idx >= questions.length){
            return 0;
        }
        
        if(dp[idx] != null) return dp[idx];
        
        //pick
        long pick = questions[idx][0] + helper(questions, idx+questions[idx][1]+1);
        
        //doNotPick
        long doNotPick = helper(questions, idx+1);
        
        return dp[idx] = Math.max(pick, doNotPick);
    }
}