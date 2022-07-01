class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 0;
        if(nums.length<2){
            return 1;
        }
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                continue;
            }
            nums[k+1] = nums[i];
            k++;
        }
        
        return k+1;
    }
}