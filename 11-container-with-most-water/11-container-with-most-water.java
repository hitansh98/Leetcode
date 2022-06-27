class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int max = 0;
        while(left<right){
            int width = right - left;
            int minHeight = Math.min(height[left], height[right]);
            
            if(max < width*minHeight){
                max = width*minHeight;
            }
            
            if(height[left] > height[right]){
                right--;
            }
            else{
                left++;
            }
        }
        
        return max;
    }
}