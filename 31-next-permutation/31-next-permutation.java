class Solution {
    public void nextPermutation(int[] nums) {
        if(nums == null || nums.length <= 1){
            return;
        }
        
        int left = nums.length-2;
        
        while(left>=0 && nums[left] >= nums[left+1]){
            left--;
        }
        
        if(left>=0){
            int right = nums.length-1;
            
            while(right>=0 && nums[left] >= nums[right]){
                right--;
            }
            
            swap(nums, left, right);
        }
        
        reverse(nums, left+1);
        
    }
    
    public void swap(int[] nums, int left, int right){
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
    
    public void reverse(int[] nums, int left){
        int low = left;
        int hi = nums.length-1;
        
        while(low<hi){
            swap(nums,low,hi);
            low++;
            hi--;
        }
    }
}