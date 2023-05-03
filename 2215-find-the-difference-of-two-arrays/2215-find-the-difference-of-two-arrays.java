class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        Set<Integer> n1 = new HashSet<Integer>();
        Set<Integer> n2 = new HashSet<Integer>();
        List<Integer> na1 = new ArrayList<Integer>(n1);
        List<Integer> na2 = new ArrayList<Integer>(n2);
        
        for(int temp: nums1){
            n1.add(temp);
        }
        
        for(int temp: nums2){
            n2.add(temp);
        }
        
        
         for(int temp: n1){
            if(!n2.contains(temp)){
                na1.add(temp);
            }
        }
        
        
        for(int temp: n2){
            if(!n1.contains(temp)){
                na2.add(temp);
            }
        }
        
        
        
        res.add(na1);
        res.add(na2);
        
        return res;
    }
}