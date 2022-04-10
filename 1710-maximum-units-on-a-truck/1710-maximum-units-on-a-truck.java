class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a,b) -> b[1] - a[1] );
        int index = 0;
        int res = 0;
        while(truckSize>0 && index<boxTypes.length){
            res += boxTypes[index][1];
            boxTypes[index][0] -= 1;
            truckSize--;
            
            if(boxTypes[index][0]==0){
                index++;
            }
        }
        
        return res;
    }
}