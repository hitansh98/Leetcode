class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int result = 0;
        
        for(int i=1;i<timeSeries.length;i++){
            result += Math.min(timeSeries[i]-timeSeries[i-1], duration);
        }
        
        result+=duration;
        
        return result;
    }
}