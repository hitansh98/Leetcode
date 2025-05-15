class Solution {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        List<String> res = new ArrayList<>();

        int ptr = groups[0];
        res.add(words[0]);

        for(int i=1;i<groups.length;i++) {
            if(ptr != groups[i]) {
                res.add(words[i]);
                ptr = groups[i];
            }
        }

        return res;


    }
}