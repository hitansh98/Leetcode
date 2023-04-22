class Solution {
    public int minimizeArrayValue(int[] nums) {
        long max = nums[0];
        long sum = nums[0];
        
        for(int i=1;i<nums.length;i++){
            sum += nums[i];
            
            long avg = (long)(Math.ceil((sum) / (i+1.0)));
            
            max = Math.max(max, avg);
        }
        
        return (int)max;
    }
}