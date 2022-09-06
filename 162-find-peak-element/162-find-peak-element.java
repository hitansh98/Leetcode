class Solution {
    public int findPeakElement(int[] nums) {
        if(nums.length==1) return 0;
        if(nums[0]>nums[1]){
            return 0;
        }
        
        else if(nums[nums.length-1]>nums[nums.length-2]){
            return nums.length-1;
        }
        
        return helper(nums, 0, nums.length-1);
    
    }
    
    public int helper(int[] nums, int start, int end){
        
        if(start>end){
            return -1;
        }
        
        while(start<=end){
            int mid = start+ (end-start)/2;
            
//             if(start<nums.length-1 && nums[start]>nums[start+1]){
//                 System.out.println("Check 1 "+start+" "+mid+" "+end);
//                 return start;
//             }
            
//             else if(end>0 && nums[end]>nums[end-1]){
//                 System.out.println("Check 2 "+start+" "+mid+" "+end);
//                 return end;
//             }
            
            if(mid>0 && mid<nums.length-1 && nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1]){
                // System.out.println("Check 3 "+start+" "+mid+" "+end);
                return mid;
            }
            
            if(helper(nums, mid+1, end)!=-1){
                return helper(nums, mid+1, end);
            }
            return helper(nums, start, mid-1);
            
        }
        
        return -1;
    }
}