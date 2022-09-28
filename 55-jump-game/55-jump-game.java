class Solution {
    public boolean canJump(int[] nums) {
        int flag = nums.length-1;
        
        int i=flag-1;
        while(i>=0){
            if(nums[i] >= flag-i ){
                flag = i;
                i = flag-1;
                continue;
            }
            
            i--;
        }
        System.out.println(flag);
        if(flag == 0){
            return true;
        }
        
        return false;
    }
    
}