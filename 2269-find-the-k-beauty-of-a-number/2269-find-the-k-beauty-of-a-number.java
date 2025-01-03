class Solution {
    public int divisorSubstrings(int num, int k) {
        String numString = "" + num;
        int result = 0;
        for(int i=0;i<numString.length() - k + 1;i++) {
            String numSubs = numString.substring(i, i+k);
            System.out.println(numSubs);
            if(Integer.valueOf(numSubs) != 0 && num % Integer.valueOf(numSubs) == 0) {
                result++;
            }
        }

        return result;
    }
}