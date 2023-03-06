class Solution {
    public int findKthPositive(int[] arr, int k) {
        int ptr = 0;
        // int i;
//         for(int x=0;x<arr.length && k>0;x++){
//             if(arr[x]-1 != x){
//                 int temp = arr[x]-1;
//                 while(temp!=x && k>0){
//                     k--;
//                     temp--;
//                 }
//                 if(k==0){
                    
//                 }
                
//             }
            
            
//         }
        
        // return arr[]
        int i;
        for(i=1;i<2000 && k>0 && ptr<arr.length;i++){
            if(arr[ptr]==i){
                ptr++;
                continue;
            }
            else{
                k--;
            }
        }
        
        if(ptr == arr.length && k>0){
            return arr[arr.length-1] + k;
        }
        
        return i-1;
        
    }
}