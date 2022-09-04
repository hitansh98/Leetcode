class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
        int max = 0;
        for(int left=0, right=0;right<s.length()&&left<s.length();){
            if(!hm.keySet().contains(s.charAt(right))){
                hm.put(s.charAt(right), right);
                max = Math.max(max, right-left+1);
                right++;
            }
            else{
                left = Math.max(left,hm.get(s.charAt(right))+1);
                hm.remove(s.charAt(right));
            }
        }
        
        return max;
    }
}