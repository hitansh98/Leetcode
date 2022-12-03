class Solution {
    public String frequencySort(String s) {
        char[] cArr = s.toCharArray();
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
        for(char c: cArr){
            int count = hm.getOrDefault(c, 0);
            hm.put(c, ++count);
        }
        
        
//         PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>((a,b) -> b.getValue()-a.getValue());
//         pq.addAll(hm.entrySet());
        
        
        List<Character>[] pos = new List[s.length()+1];
        
        for(char key: hm.keySet()){
            
            if(pos[hm.get(key)] == null) pos[hm.get(key)] = new ArrayList<Character>();
            pos[hm.get(key)].add(key);
        }
        
        String res = "";
        // while(!pq.isEmpty()){
        //     Map.Entry e = pq.poll();
        //     for (int i = 0; i < (int)e.getValue(); i++) 
        //         res += e.getKey();
        // }
        
        for(int i=pos.length-1; i>=0;i--){
            if(pos[i]==null) continue;
            List<Character> list = pos[i];
            for(int k=0;k<list.size();k++){
                for(int j=0;j<i;j++){
                    res += list.get(k);
                }
            }
            
        }
        
        return res;
    }
}