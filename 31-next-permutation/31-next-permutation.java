class Solution {
    public void nextPermutation(int[] nums) {
        int index = nums.length-2;
        while(index>=0 && nums[index]>=nums[index+1]){
            index--;
        }
        
        if(index>=0){
            int j = nums.length-1;
            while(nums[index]>=nums[j]) j--;
            swap(nums, index, j);
        }
        
        reverse(nums, index+1, nums.length-1);
    }
    
    public void swap(int[] nums, int a, int b){
        int temp = nums[b];
        nums[b]=nums[a];
        nums[a] = temp;
    }
    
    public void reverse(int[] nums, int a, int b){
        while(a<b){
            swap(nums, a++, b--);
        }
    }
}