class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        int[][] res = new int[1001][2];
        Set<Integer> hs = new TreeSet<Integer>();
        
        
        for(int[] item: items1){
            int val = item[0];
            int wt = item[1];
            
            // List<Integer> al = res.getOrDefault(val, new ArrayList<Integer>());
            
            if(res[val][0] !=val){
                res[val] = new int[]{val, wt};
                hs.add(val);
            }
            else{
                res[val][1] += wt; 
            }
        }
        
        for(int[] item: items2){
            int val = item[0];
            int wt = item[1];
            
            // List<Integer> al = res.getOrDefault(val, new ArrayList<Integer>());
            
            if(res[val][0] !=val){
                res[val] = new int[]{val, wt};
                hs.add(val);
            }
            else{
                res[val][1] += wt; 
            }
        }
        
        List<List<Integer>> al = new ArrayList<>();
        
        Iterator<Integer> it = hs.iterator();
        
        while(it.hasNext()){
            int val = it.next();
            List<Integer> tmp = new ArrayList<Integer>();
            tmp.add(res[val][0]);
            tmp.add(res[val][1]);
            al.add(tmp);
        }
        
        
        // System.out.print(al);
        
        return al;
    }
}