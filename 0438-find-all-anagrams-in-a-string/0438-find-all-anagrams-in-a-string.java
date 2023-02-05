class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<Integer>();
        if(p.length() > s.length()) return result;
        
        int sLen = s.length();
        int pLen = p.length();
        
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];
        
        for(int i=0;i<pLen;i++){
            arr1[p.charAt(i)-'a']++;
            arr2[s.charAt(i)-'a']--;
        }
        
        if(allZeroes(arr1, arr2)){
            result.add(0);
        }
        
        for(int i=pLen;i<sLen;i++){
            arr2[s.charAt(i)-'a']--;
            arr2[s.charAt(i - pLen) -'a']++;
            
            if(allZeroes(arr1, arr2)){
                result.add(i - pLen + 1);
            }
        }
        
        return result;
        
    }
    
    
    public boolean allZeroes(int[] arr1, int[] arr2){
        for(int i=0;i<arr1.length;i++){
            if((arr1[i] != 0) && arr1[i] + arr2[i] != 0) return false;
        }
        
        return true;
    }
}