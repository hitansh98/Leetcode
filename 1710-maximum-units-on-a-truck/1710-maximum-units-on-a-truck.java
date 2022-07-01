class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int res = 0;
        Arrays.sort(boxTypes, (a,b) -> b[1]-a[1]);
        for(int[] box: boxTypes){
            int count = Math.min(truckSize, box[0]);
            res += count*box[1];
            truckSize -= count;
            
            if(truckSize == 0) return res;
        }

        
        return res;
        
    }
}