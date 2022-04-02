class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        int[] arr = new int[2];
        for(int i=0;i<nums.length;i++){
            int val = target-nums[i];
            
            if(hm.containsKey(val)){
                arr[0] = hm.get(val);
                arr[1] = i;
                return arr;
            }
            else{
                hm.put(nums[i], i);
            }

        }
        
         return arr;
    }
}