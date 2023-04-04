class Solution {
    public int partitionString(String s) {
        return helper(s, 1, s.length());
    }
    
    public int helper(String s, int low, int high){
        while(low<high){
            int mid = low + (high-low)/2;
            
            if(!satisfiesCondition(s, mid)){
                low = mid + 1;
            }
            else{
                high = mid;
            }
        }
        
        return low;
    }
    
    public boolean satisfiesCondition(String s, int mid){
        int ptr = 0;
        Set<Character> hs = new HashSet<>();
        int parts = 1;
        while(ptr<s.length() && parts <= mid){
            if(hs.contains(s.charAt(ptr))){
                parts++;
                hs.clear();
                hs.add(s.charAt(ptr));
            }
            else{
                hs.add(s.charAt(ptr));
                
            }
            ptr++;
        }
        
        
        if(parts > mid || ptr < s.length()-1){
            return false;
        }
        
        return true;
    }
}