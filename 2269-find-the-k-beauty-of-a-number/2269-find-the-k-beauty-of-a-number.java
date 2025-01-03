class Solution {
    public int divisorSubstrings(int num, int k) {
        String numString = String.valueOf(num);
        int result = 0;
        for(int i=0;i<numString.length() - k + 1;i++) {
            String numSubs = numString.substring(i, i+k);
            int subsValue = Integer.valueOf(numSubs);
            if(subsValue != 0 && num % subsValue == 0) {
                result++;
            }
        }

        return result;
    }
}