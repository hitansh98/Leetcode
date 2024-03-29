class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hm = new HashMap<>();
        if(strs.length==0) return new ArrayList<>();
        for(String str: strs){
            char[] alpha = new char[26];
            for(char c: str.toCharArray()) alpha[c - 'a']++;
            // char[] cArr = str.toCharArray();
            // Arrays.sort(cArr);
            String val = String.valueOf(alpha);
            
            if(!hm.keySet().contains(val)){;
                hm.put(val, new ArrayList<String>());
            }
            
            hm.get(val).add(str);
            
        }
        
        return new ArrayList<>(hm.values());
        
    }
}