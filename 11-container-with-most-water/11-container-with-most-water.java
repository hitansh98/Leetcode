class Solution {
    public int maxArea(int[] height) {
        int start = 0;
        int end = height.length - 1;
        int max = 0;
        
        while(start<end){
            int width = end-start;
            int minHeight = Math.min(height[start], height[end]);
            
            max = Math.max(max, width*minHeight);
            
            if(height[start]>height[end]){
                end--;
            }
            
            else{
                start++;
            }
        }
        
        return max;
    }
}