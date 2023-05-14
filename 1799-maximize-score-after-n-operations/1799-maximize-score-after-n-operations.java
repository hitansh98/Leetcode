class Solution {
    Map<String, Integer> dp;
    public int maxScore(int[] nums) {
        dp = new HashMap<>();
        return helper(nums, new boolean[nums.length], nums.length/2);
        
        
    }
    
    public int gcd(int x, int y){
        if(y==0){
            return x;
        }
        else if(x==0){
            return y;
        }
        else{
            return gcd(y, x % y);
        }
    }
    
    public int helper(int[] nums, boolean[] taken, int operations){
        if(operations == 0){
            return 0;
        }
        
        String key = Arrays.toString(taken) + "," + operations;
        if(dp.containsKey(key)){
            return dp.get(key);
        }
        
        int max = Integer.MIN_VALUE;
        
        for(int i=0;i<nums.length;i++){
            for(int j=i+1; j<nums.length;j++){
                if(!taken[i] && !taken[j]){
                    taken[i] = true;
                    taken[j] = true;
                    int val = (operations * gcd(nums[i], nums[j])) + helper(nums, taken, operations-1);
                    max = Math.max(max, val);
                    taken[i] = false;
                    taken[j] = false;
                }
            }
        }
        dp.put(key, max);
        return max;
    }
}