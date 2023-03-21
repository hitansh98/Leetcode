class Solution {
    // Boolean[] dp;
    boolean[] vis;
    
    public boolean canReach(int[] nums, int start) {
        // dp = new Boolean[arr.length];
        vis = new boolean[nums.length];
        Arrays.fill(vis, false);
        // return helper(arr, start);
        // System.out.println(Arrays.toString(vis));
        
        LinkedList<Integer> q = new LinkedList<>();
        
        q.push(start);
        while(!q.isEmpty()){
            int size = q.size();
            
            for(int i=0;i<size;i++){
                int curr = q.poll();
                
                if(nums[curr] == 0){
                    return true;
                }
                
                if(curr + nums[curr] < nums.length && vis[curr + nums[curr]] != true) q.offer(curr + nums[curr]);
                if(curr - nums[curr] >= 0 && vis[curr - nums[curr]] != true) q.offer(curr - nums[curr]);
                
                vis[curr] = true;
            }
        }
        
        return false;
    }
    
//     public boolean helper(int[] arr, int start){
//         if(start<0 || start >= arr.length || vis[start] == true){
//             return false;
//         }
        
//         if(arr[start] == 0){
//             return true;
//         }
        
        
//         if(dp[start] != null){
//             return dp[start];
//         }
        
//         vis[start] = true;
//         dp[start] = helper(arr, start + arr[start]) || helper(arr, start - arr[start]);
        
//         return dp[start];
    // }
    
    
}