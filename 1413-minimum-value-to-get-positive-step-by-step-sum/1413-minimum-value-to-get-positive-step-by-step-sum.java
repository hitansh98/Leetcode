class Solution {
    public int minStartValue(int[] nums) {
        int minVal = 0;
        int sum = 0;
        
        for(int num: nums){
            sum += num;
            minVal = Math.min(minVal, sum);
            
        }
        // System.out.println(minVal);
//         if(minVal>0){
            
//         }
        
        return 1-minVal;
//         int low = 1;
//         int high = (-1*minVal*nums.length) + 1;
//         // System.out.println(high);
//         while(low<high){
//             int mid = (high-low)/2 + low;
            
//             if(!check(nums, mid)){
//                 low = mid + 1; 
//             }
//             else{
//                 high = mid;
//             }
//         }
        
        
//         return low;
    }
    
//     public boolean check(int[] arr, int mid){
//         int sum = 0;
//         // int sum=mid;
//         for(int i=0;i<arr.length;i++){
//             if(i==0){
//                 sum += mid+arr[i];
//             }
//             else{
//                 sum+=arr[i];
//             }
//             if(sum<1) return false;
//             // sum+=n;
//         }
        
//         return true;
//     }
}