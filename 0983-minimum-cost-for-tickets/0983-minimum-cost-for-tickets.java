class Solution {
    Integer[][] dp;
    public int mincostTickets(int[] days, int[] costs) {
        dp = new Integer[days.length][395];
        return helper(days, costs, 0, 0);
    }
    
    public int helper(int[] days, int[] costs, int index, int validTill){
        if(index >= days.length){
            return 0;
        }
        
        if(dp[index][validTill] != null){
            return dp[index][validTill];
        }
        
        if(validTill < days[index]){
            int min = Integer.MAX_VALUE;
            
            int oneDay = costs[0] + helper(days, costs, index+1, days[index]);
            int oneWeek = costs[1] + helper(days, costs, index+1, days[index]+6);
            int oneMonth = costs[2] + helper(days, costs, index+1, days[index]+29);
            
            if(min > oneDay) min = oneDay;
            if(min > oneWeek) min = oneWeek;
            if(min > oneMonth) min = oneMonth;
            
            return dp[index][validTill] = min;
        }
        
        return dp[index][validTill] = helper(days, costs, index+1, validTill);
        
    }
}