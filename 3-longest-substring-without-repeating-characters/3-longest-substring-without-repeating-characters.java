class Solution {
    public int lengthOfLongestSubstring(String s) {
        // HashMap<Character, Integer> hm = new HashMap<Character,Integer>();
        HashSet<Character> hs = new HashSet<Character>();
        int max = 0;
        for(int left=0, right=0;right<s.length()&&left<s.length();){
            if(!hs.contains(s.charAt(right))){
                hs.add(s.charAt(right));
                max = Math.max(max, right-left+1);
                right++;
            }
            else{
                hs.remove(s.charAt(left));
                left++;
            }
        }
        
        return max;
    }
}