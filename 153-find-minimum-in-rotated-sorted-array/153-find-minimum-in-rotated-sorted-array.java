 class Solution {
    public int findMin(int[] nums) {
        int pIndex = findPivot(nums);
        // System.out.println(pIndex);
        if(pIndex==-1 || pIndex==nums.length-1){
            return nums[0];
        }
        
        else if(pIndex==0){
            return nums[1];
        }
        
        return Math.min(nums[0], nums[pIndex+1]);
    }
    
    public int findPivot(int[] nums){
        int start = 0;
        int end = nums.length-1;
        
        while(start<=end){
            int mid = start + (end-start)/2;
            
            //4 cases
            if(mid<end &&nums[mid]>nums[mid+1]){
                return mid;
            }
            
            else if(mid>start && nums[mid]<nums[mid-1]){
                return mid-1;
            }
            
            else if(nums[start]>nums[mid]){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
            
        }
        
        return -1;
    }
}