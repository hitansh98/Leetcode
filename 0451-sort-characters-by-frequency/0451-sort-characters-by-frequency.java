class Solution {
    public String frequencySort(String s) {
        char[] cArr = s.toCharArray();
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
        for(char c: cArr){
            int count = hm.getOrDefault(c, 0);
            hm.put(c, ++count);
        }
        
        
        PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>((a,b) -> b.getValue()-a.getValue());
        pq.addAll(hm.entrySet());
        
        
        String res = "";
        while(!pq.isEmpty()){
            Map.Entry e = pq.poll();
            for (int i = 0; i < (int)e.getValue(); i++) 
                res += e.getKey();
        }
        
        return res;
    }
}