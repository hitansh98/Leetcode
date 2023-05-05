class Solution {
    public int maxVowels(String s, int k) {
        int[] vowels = new int[26];
        vowels[0] = 1;
        vowels[4] = 1;
        vowels[8] = 1;
        vowels[14] = 1;
        vowels[20] = 1;
        
        int count = 0;
        int ans = 0;
        for(int i=0;i<k;i++){
            if(vowels[s.charAt(i) - 'a'] == 1){
                count++;
            }
        }
        
        ans = Math.max(ans, count);
        
        for(int i=k;i<s.length();i++){
            if(vowels[s.charAt(i-k) - 'a'] == 1){
                count--;
            }
            if(vowels[s.charAt(i) - 'a'] == 1){
                count++;
            }
            
            ans = Math.max(count, ans);
        }
        
        return ans;
    }
}