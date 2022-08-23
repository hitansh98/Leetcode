class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        int[] rArr = new int[2];
        for(int i=0;i<nums.length;i++){
            if(hm.keySet().contains(nums[i])){
                rArr[0] = hm.get(nums[i]);
                rArr[1] = i;
                return rArr;
            }
            
            hm.put(target-nums[i], i);
        }
        return rArr;
    }
}