class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hm = new HashMap<>();
        for(String str: strs){
            char[] cArr = str.toCharArray();
            Arrays.sort(cArr);
            String val = String.valueOf(cArr);
            
            if(!hm.keySet().contains(val)){
                List<String> al = new ArrayList<String>();
                al.add(str);
                hm.put(val, al);
            }
            else{
                hm.get(val).add(str);
            }
        }
        
        return new ArrayList<>(hm.values());
        
    }
}