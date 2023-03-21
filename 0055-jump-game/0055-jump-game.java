class Solution {
    public boolean canJump(int[] nums) {
        int flag = nums.length - 1;
        int ptr = flag-1;
        // System.out.println("initially ptr: " + ptr);
        while(ptr>=0){
            if(ptr + nums[ptr] >=flag){
                flag = ptr;
                // System.out.println("new flag: "+flag);
            }
            ptr--;
        }
        
        return flag==0;
    }
}