class Solution {
    public int maxArea(int[] height) {
        int start = 0;
        int end = height.length - 1;
        int max = Integer.MIN_VALUE;
        
        while(start<end){
            if(max< (end-start)*Math.min(height[start], height[end])){
                max = (end-start)*Math.min(height[start], height[end]);
            }
            
            if(height[start]<height[end]){
                start++;
            }
            
            else{
                end--;
            }
        }
        
        return max;
    }
}