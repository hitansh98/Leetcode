class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> resArray = new ArrayList<List<Integer>>();
        for(int i=0;i<nums.length-2;i++){
            int res = nums[i]*(-1);
            // System.out.print("Target Sum: "+res+" ");
            int start = i+1;
            int end = nums.length-1;
            while(start<end){
                int tempSum = nums[start] + nums[end];
                // System.out.println("Temp Sum: "+tempSum);
                if(tempSum < res){
                    start++;
                }
                else if(tempSum > res){
                    end--;
                }
                else{
                    // System.out.println("Enetered l1");
                    List<Integer> lArr = new ArrayList<Integer>();
                    lArr.add(nums[i]);
                    lArr.add(nums[start]);
                    lArr.add(nums[end]);
                    if(!resArray.contains(lArr)){
                        resArray.add(lArr);
                    }
                    start++;
                    end--;
                    continue;
                }
            }
            // System.out.println(resArray);
        }
        return resArray;
    }
}