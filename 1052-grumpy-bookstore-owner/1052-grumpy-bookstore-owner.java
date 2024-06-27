class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int n = customers.length;
        int[] sliderValues = new int[n-minutes+1];
        int maxValue = Integer.MIN_VALUE;
        int maxIndex = -1;
        for(int i=0;i<sliderValues.length;i++) {
            sliderValues[i] = computeValue(customers, grumpy, sliderValues, minutes, i);
            if(maxValue < sliderValues[i]) {
                maxIndex = i;
                maxValue = sliderValues[i];
            }
        }
        System.out.println(Arrays.toString(sliderValues));
        for(int i=maxIndex;i<maxIndex + minutes;i++) {
            grumpy[i] = 0;
        }
        
        int max = 0;
        for(int i=0;i<n;i++) {
           if(grumpy[i] == 0) {
               max += customers[i];
           }
        }
        return max;
        
        
    }
    
    public int computeValue(int[] customers, int[] grumpy, int[] sliderValues, int minutes, int startIdx) {
        int res = 0;
        if(startIdx == 0) {
            for(int i=startIdx;i<startIdx+minutes;i++) {
                res += customers[i]*grumpy[i];
            }
        } else {
            res = sliderValues[startIdx-1];
            res -= customers[startIdx-1]*grumpy[startIdx-1];
            res += customers[startIdx+minutes-1]*grumpy[startIdx+minutes-1]; 
        }
        
        return res;
    }
    
}