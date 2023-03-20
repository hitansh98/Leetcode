class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        // int result = 0;
        int dur = duration;
        
        for(int i=1;i<timeSeries.length;i++){
            dur += Math.min(timeSeries[i]-timeSeries[i-1], duration);
        }
        
        // result+=duration;
        
        return dur;
    }
}