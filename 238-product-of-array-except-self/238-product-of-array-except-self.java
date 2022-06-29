class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        res[0] = 1;
        
        for(int i=1;i<res.length;i++){
            res[i] = res[i-1]*nums[i-1];
            // System.out.print(res[i]+" ");
        }
        // System.out.println();
        int right = 1;
        
        for(int i=res.length-1;i>=0;i--){
            res[i] = right*res[i];
            right *=  nums[i];
            // System.out.print(res[i]+" ");
        }
        
        return res;
    }
}