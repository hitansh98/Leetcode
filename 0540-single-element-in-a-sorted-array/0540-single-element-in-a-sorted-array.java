class Solution {
    public int singleNonDuplicate(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        
        
        
        while(left<=right){
            int mid = (right-left)/2 + left;
            System.out.println(mid);
            if(mid<=0 || mid>=nums.length-1){
                // System.out.println(mid);
                return nums[mid];
            }
            if(nums[mid-1]!=nums[mid] && nums[mid+1]!=nums[mid]){
                // System.out.println(mid);
                return nums[mid];
            }
            
            else if((mid%2==0 && nums[mid-1]==nums[mid]) || (mid%2==1 && nums[mid+1]==nums[mid])){
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }
        
        return -1;
    }
}