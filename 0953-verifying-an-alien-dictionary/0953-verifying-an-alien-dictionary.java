class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        Map<Character, Integer> hm = new HashMap<>();
        
        if(words.length<=1) return true;
        
        int count = 1;
        for(char c: order.toCharArray()){
            hm.put(c, count);
            count++;
        }
        
        // System.out.println(hm);
        int first = 0;
        int second =1;
        
        
        while(second<words.length){
            char[] arr1 = words[first].toCharArray();
            char[] arr2 = words[second].toCharArray();
            
            
            for(int idx = 0;idx<arr1.length && idx<arr2.length; idx++){
                if(hm.get(arr1[idx]) > hm.get(arr2[idx])){
                    // System.out.println(hm.get(arr1[idx]) + " " + hm.get(arr2[idx]));
                    return false;
                }
                else if(hm.get(arr1[idx]) == hm.get(arr2[idx])){
                    if(idx==arr1.length-1 || idx==arr2.length-1){
                        if(arr1.length > arr2.length){
                            return false;
                        }
                    }
                    continue;
                }
                else{
                    break;
                }
            }
            
            first++;
            second++;
        }
        
        return true;
        
        
    }
}