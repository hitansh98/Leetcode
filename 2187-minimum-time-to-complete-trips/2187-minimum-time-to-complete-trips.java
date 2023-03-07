class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        long max = 0;
        long min = Long.MAX_VALUE;
        for(int t: time){
            min = Math.min(min, t);
            max = Math.max(max, t);
        }
        long low = min;
        long high = max*totalTrips;
        
        while(low < high){
            long mid = (high-low)/2 + low;
            long trips = 0;
            long ans = 0;
            for(int t:time){
                trips+= mid/t;
            }
            
            if(trips < totalTrips){
                low = mid+1;
            }
            else{
                high = mid;
            }
        }
        
        return low;
    }
}