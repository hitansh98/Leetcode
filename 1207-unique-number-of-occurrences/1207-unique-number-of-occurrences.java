class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        
        for(int i=0;i<arr.length;i++){
            int count = hm.getOrDefault(arr[i], 0);
            hm.put(arr[i], ++count);
        }
        
        int len = hm.keySet().size();
        int[] indexArr = new int[arr.length+1];
        for(int i: hm.keySet()){
            if(indexArr[hm.get(i)] != 0){
                return false;
            }
            
            indexArr[hm.get(i)] = 1;
        }
        
        return true;
          
    }
}