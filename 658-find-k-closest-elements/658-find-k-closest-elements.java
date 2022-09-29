class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> res = new ArrayList<Integer>();
        if(x<arr[0]){
            for(int i=0;i<k;i++){
                res.add(arr[i]);
            }
            
            return res;
        }
        
        else if(x>arr[arr.length-1]){
            for(int i=k;i>0;i--){
                res.add(arr[arr.length-i]);
            }
            return res;
        }
        
        else{
            int ind = findIndex(arr, x);
            int left = ind;
            int right = ind+1;
            if(arr[left]==x){
                res.add(arr[left]);
                left--;
            }
            
            while(res.size()<k && left>=0 && right<arr.length){
                int dist1 = Math.abs(x - arr[left]);
                int dist2 = Math.abs(x - arr[right]);
                if(dist1<=dist2){
                    res.add(0, arr[left]);
                    left--;
                }
                else{
                    res.add(arr[right]);
                    right++;
                }
            }
                    
                
            if(left<0){
                while(res.size()<k){
                    res.add(arr[right]);
                    right++;
                }
            }
            
            else if(right>=arr.length){
                while(res.size()<k){
                    res.add(0, arr[left]);
                    left--;
                }
            } 
        }
        
        
        return res;
    }
    
    public int findIndex(int[] arr, int x){
        int left = 0;
        int right = arr.length-1;

        while(left<=right){
            int mid = left+ (right-left)/2;

            if(arr[mid]==x){
                return mid;
            }
            
            if(arr[mid]<x){
                left = mid+1;
            }
            
            else if(arr[mid]>x){
                right = mid-1;
            }
        }
        
        return right;
    }
}