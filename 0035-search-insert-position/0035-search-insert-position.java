class Solution {
    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        
        int res = binarySearch(nums, target, low, high);
        
        return res;
    }
    
    public int binarySearch(int[] nums, int target, int low, int high){
        while(low<=high){
            int mid = (high-low)/2 + low;
            
            if(nums[mid]==target){
                return mid;
            }
            
            else if(nums[mid]>target){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        
        return low;
    }
}