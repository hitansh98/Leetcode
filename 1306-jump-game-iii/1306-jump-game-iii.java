class Solution {
    Boolean[] dp;
    Boolean[] vis;
    
    public boolean canReach(int[] arr, int start) {
        dp = new Boolean[arr.length];
        vis = new Boolean[arr.length];
        Arrays.fill(vis, false);
        return helper(arr, start);
    }
    
    public boolean helper(int[] arr, int start){
        if(start<0 || start >= arr.length || vis[start] == true){
            return false;
        }
        
        if(arr[start] == 0){
            return true;
        }
        
        
        
        if(dp[start] != null){
            return dp[start];
        }
        
        vis[start] = true;
        dp[start] = helper(arr, start + arr[start]) || helper(arr, start - arr[start]);
        
        return dp[start];
    }
    
    
}