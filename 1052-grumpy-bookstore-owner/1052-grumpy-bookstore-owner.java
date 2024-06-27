class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int total = 0;
        int res = 0;
        
        for(int i=0;i<customers.length;i++) {
            total += (1 - grumpy[i])*customers[i];
        }
        
        int windowAll = 0;
        int windowPartial = 0;
        for(int i=0;i<customers.length;i++) {
            windowAll += customers[i];
            windowPartial += (1-grumpy[i])*customers[i];

            if(i >= minutes - 1) {
                res = Math.max(res, total + windowAll - windowPartial);
                int left = i - minutes + 1;
                windowAll -= customers[left];
                windowPartial -= (1-grumpy[left])*customers[left];
            }
        }
        
        return res;
    }
}