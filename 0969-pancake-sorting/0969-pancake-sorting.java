class Solution {
    public List<Integer> pancakeSort(int[] arr) {
        int len = arr.length;
        List<Integer> res = new ArrayList<>();
        
        while(len > 0){
            int max = Integer.MIN_VALUE;
            int maxIndex = -1;
            for(int i=0;i<len;i++){
                if(max < arr[i]){
                    max = arr[i];
                    maxIndex = i;
                }
            }
            
            if(maxIndex == len-1){
                len--;
                continue;
            }
            
            reverse(arr, maxIndex+1);
            res.add(maxIndex+1);
            reverse(arr, len);
            res.add(len);
            len--;
        }
        
        return res;
    }
    
    
    public void reverse(int[] arr, int k){
        int left = 0;
        int right = k-1;
        
        while(left<right){
            int temp = arr[left];
            arr[left++] = arr[right];
            arr[right--] = temp;
        }
    }
}