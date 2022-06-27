class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> resArray = new ArrayList<List<Integer>>();
        for(int i=0;i<nums.length-2;i++){
            if(i==0 || nums[i] != nums[i-1]){
                int res = 0-nums[i];
                int start = i+1;
                int end = nums.length-1;
                while(start<end){

                    int tempSum = nums[start] + nums[end];
                    if(tempSum < res){
                        start++;
                    }
                    else if(tempSum > res){
                        end--;
                    }
                    else{
                        resArray.add(Arrays.asList(nums[i], nums[start], nums[end]));
                        while(start<end && nums[start]==nums[start+1]) start++;
                        while(start<end && nums[end]==nums[end-1]) end--;
                        start++; end--;
                        continue;
                        // System.out.println("Enetered l1");

                    }
                }
            }
            // System.out.println(resArray);
        }
        return resArray;
    }
}