class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        Set<String> hs = new HashSet<>();
        Set<String> res = new HashSet<String>();
        for(int i=0;i<=s.length()-10;i++){
            String subs = s.substring(i, i+10);
            int subsHash = subs.hashCode();
            if(hs.contains(subs)){
                res.add(subs);
            }
            else{
                hs.add(subs);
            }
        }
        
        return new ArrayList<String>(res);
    }
}