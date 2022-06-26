class Solution {
    public boolean containsDuplicate(int[] nums) {
        final Set<Integer> hs = new HashSet<Integer>();
        for(int i=0;i<nums.length;i++){
            if(hs.contains(nums[i])){
                return true;
            }
            else{
                hs.add(nums[i]);
            }
        }
        
        return false;
    }
}