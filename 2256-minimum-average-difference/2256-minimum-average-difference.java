class Solution {
    public int minimumAverageDifference(int[] nums) {
        long leftSum = nums[0];
        long rightSum = 0;
        int len = nums.length;
        
        for(int i=1;i<nums.length;i++){
            rightSum += nums[i];
        }
        
        if(len==1){
            return 0;
        }
        long diff = Math.abs(leftSum - (rightSum/(len-1)));
        int res = 0;
        
        for(int i=1;i<len;i++){
            leftSum += nums[i];
            rightSum -= nums[i];
            
            long leftAvg = leftSum/(i+1);
            long rightAvg;
            if(i==len-1){
                rightAvg=0;
            }
            else{
                rightAvg = rightSum/(len-i-1);
            }
            
            
            if(diff>Math.abs(leftAvg-rightAvg)){
                diff = Math.abs(leftAvg-rightAvg);
                res = i;
            }
        }
        
        return res;
        
    }
}