class Solution {
    public int[] sortArray(int[] nums) {
        
        // mergeSort(nums, 0, nums.length-1);
        heapSort(nums);
        return nums;
    }
    
    public void mergeSort(int[] nums, int left, int right){
        if(left>=right){
            return;
        }
        
        int mid = (right-left)/2 + left;
        mergeSort(nums, left, mid);
        mergeSort(nums, mid+1, right);
        
        merge(nums, left, mid, right);
    }
    
    public void merge(int[] nums, int left, int mid, int right){
        // System.out.println(Arrays.toString(arr1)+Arrays.toString(arr2));
        int ptr1=0, ptr2=0;
        int ptr=0;
        // int[] res = new int[arr1.length+arr2.length];
//         while(ptr1<arr1.length && ptr2<arr2.length){
//             if(arr1[ptr1]>arr2[ptr2]){
//                 res[ptr++] = arr2[ptr2++];
//             }
//             else{
//                 res[ptr++] = arr1[ptr1++];
//             }
//         }
        
//         while(ptr1<arr1.length){
//             res[ptr++] = arr1[ptr1++];
//         }
        
//         while(ptr1<arr1.length){
//             res[ptr++] = arr2[ptr2++];
//         }
        
        return;
    }
    
    public void heapSort(int[] nums){
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for(int num: nums){
            pq.offer(num);
        }
        
        for(int i=0;i<nums.length;i++){
            nums[i] = pq.poll();
        }
    }
}