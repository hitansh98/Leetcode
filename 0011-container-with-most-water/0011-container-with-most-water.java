class Solution {
    public int maxArea(int[] height) {
        int start = 0;
        int end = height.length - 1;
        int maxWater = Integer.MIN_VALUE;
         while(start<end){
             int minHeight = Math.min(height[start], height[end]);
             int width = end - start;
             
             maxWater = Math.max(minHeight*width, maxWater);
             
             if(height[start] < height[end]){
                 start++;
             }
             else{
                 end--;
             }
         }
        
        return maxWater;
    }
}