class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] res = new int[2];
        int[] arr = new int[nums.length];
        
        for(int num: nums){
            arr[num-1]++;
        }
        
        for(int i=0;i<arr.length;i++){
            // System.out.print(arr[i]+" ");
            if(arr[i]>1){
                res[0] = i+1;
                continue;
            }
            
            if(arr[i]==0){
                // System.out.println(arr[i]+" "+i);
                res[1] = i+1;
                continue;
            }
        }
        
        return res;
    }
}