class Solution {
    public int[] shuffle(int[] nums, int n) {
        
        // for(int i=0;i<n;i++){
        //     int temp = nums[i];
        //     nums[i]= nums[n+i];
        //     nums[n+i] = temp;
        // }
        
        int[] arr = new int[nums.length];
        int left = 0;
        int right = n;
        boolean flag = false;
        for(int i=0;i<nums.length;i++){
            
            if(!flag){
                arr[i] = nums[left];
                left++;
            }
            else{
                arr[i] = nums[right];
                right++;
            }
            
            flag = !flag;
        }
        
        
        
        return arr;
    }
}