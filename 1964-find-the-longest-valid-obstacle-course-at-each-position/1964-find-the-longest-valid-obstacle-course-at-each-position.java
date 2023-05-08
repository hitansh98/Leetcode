class Solution {
    public int[] longestObstacleCourseAtEachPosition(int[] obstacles) {
        int[] lis = new int[obstacles.length];
        int[] result = new int[obstacles.length];
        int curr = 0;
        int i = -1;
        int lisSize = -1;
        
        for(int obs: obstacles){
            if(i == -1 || lis[i] <= obs){
                lis[++i] = obs;
                lisSize = i;
            }
            else{
                lisSize = search(lis, 0, i, obs);
                lis[lisSize] = obs;
            }
            
            result[curr++] = lisSize + 1;
        }
        
        return result;
    }
    
    public int search(int[] lis, int start, int end, int target){
        int left = start;
        int right = end;
        int boundary = 0;
        
        while(left<=right){
            int mid = left + (right-left)/2;
            if(lis[mid] > target){
                boundary = mid;
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
           
        }
        
         return boundary;
    }
    
    
}