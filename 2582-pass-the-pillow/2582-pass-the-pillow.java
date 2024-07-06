class Solution {
    public int passThePillow(int n, int time) {
        int quot = (time)/(n-1);
        int rem = (time) % (n-1);
        
        if(quot % 2 != 0) {
            rem = n - rem;
        } else {
            rem++;
        }
        return rem;
    }
}