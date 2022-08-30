class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res = new int[]{-1, -1};
        if(nums.length==0) return res;
        
        
        int start = binarySearch(nums, target, true);
        int end = binarySearch(nums, target, false);
        res[0]= start; res[1] = end;    
        return res;
    }
    
    public static int binarySearch(int[] nums, int target, boolean startIndex){
        int ans = -1;
        int low = 0;
        int high = nums.length-1;
        
        
        while(low<=high){
            int mid = low + (high-low)/2;

            if(nums[mid]<target){
                low = mid+1;
            }
            else if(nums[mid]>target){
                high = mid-1;
            }else{
                ans = mid;
                if(startIndex){
                    high = mid-1;
                }else{
                    low=mid+1;
                }
            }
        }
        
        return ans;
    }
}