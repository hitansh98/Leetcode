class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length - 1;
        
        while(start<end){
            int res = numbers[start] + numbers[end];
            
            if(res<target){
                start++;
            }
            else if(res>target){
                end--;
            }
            else{
                return new int[] {start+1, end+1};
            }
        }
        
        return new int[] {0,0};
    }
}