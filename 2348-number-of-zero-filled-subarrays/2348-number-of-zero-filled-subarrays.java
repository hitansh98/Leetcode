class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long res=0;
        
        int ptr = 0;
        long count = 0;
        while(ptr<nums.length){
            if(nums[ptr] != 0){
                count = 0;
            }
            else{
                res += ++count;
            }
            ptr++;
        }
        
        
        return res;
    }
}