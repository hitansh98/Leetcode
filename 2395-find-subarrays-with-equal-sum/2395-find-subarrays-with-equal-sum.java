class Solution {
    public boolean findSubarrays(int[] nums) {
        if(nums.length==2) return false;
        
        HashSet<Integer> hs = new HashSet<Integer>();
        for(int i=0;i<nums.length-1;i++){
            
            if(!hs.contains(nums[i]+nums[i+1])){
                hs.add(nums[i]+nums[i+1]);
            }
            
            else{
                return true;
            }
            
        }
        
        return false;
    }
}