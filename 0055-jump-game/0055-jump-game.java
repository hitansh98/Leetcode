class Solution {
    public boolean canJump(int[] nums) {
        int flag = nums.length - 1;
        int ptr = flag;
        
        while(--ptr>=0){
            if(ptr + nums[ptr] >=flag){
                flag = ptr;
            }
        }
        
        return flag==0;
    }
}