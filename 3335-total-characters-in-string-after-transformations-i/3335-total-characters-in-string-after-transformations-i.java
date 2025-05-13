class Solution {
    public static final int MOD = 1_000_000_007;
    public int lengthAfterTransformations(String s, int t) {
        int[] freq = new int[26];
        for(char c: s.toCharArray()) {
            freq[c-'a']++;
        }

        for(int i=0;i<t;i++) {
            int[] temp = new int[26];
            for(int j=0;j<25;j++) {
                temp[j+1] = freq[j];
            }
            temp[0] = (temp[0] + freq[25]) % MOD;
            temp[1] = (temp[1] + freq[25]) % MOD;
            freq = temp;
        }

        long res = 0;
        for(int num: freq) {
            res=(res + num)%MOD;
        }

        return (int)res;
    }
}