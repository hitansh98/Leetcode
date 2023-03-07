class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        long low = 0;
        long high = 100_000_000_000_000L;
        
        while(low < high){
            long mid = (high-low)/2 + low;
            long trips = 0;
            long ans = 0;
            for(int t:time){
                trips+= mid/t;
            }
            
            // if(trips == totalTrips){
            //     ans = mid;
            // }
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