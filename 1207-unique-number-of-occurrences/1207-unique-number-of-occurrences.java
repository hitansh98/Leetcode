class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        
        for(int i=0;i<arr.length;i++){
            int count = hm.getOrDefault(arr[i], 0);
            hm.put(arr[i], ++count);
        }
        
        int len = hm.keySet().size();
        HashSet<Integer> indexSet = new HashSet<Integer>();
        for(int i: hm.keySet()){
            if(indexSet.contains(hm.get(i))){
                return false;
            }
            indexSet.add(hm.get(i));
        }
        
        return true;
          
    }
}