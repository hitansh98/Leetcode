class Solution {
    public int totalFruit(int[] fruits) {
        Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
        
        int i = 0, j, res = 0;
        for(j=0;j<fruits.length;++j){
            hm.put(fruits[j], hm.getOrDefault(fruits[j], 0) + 1);
            int count = hm.size();
            if(count > 2){
                hm.put(fruits[i], hm.get(fruits[i])-1);
                if(hm.get(fruits[i])==0){
                    hm.remove(fruits[i]);
                }
                i++;
            }
            // System.out.println(hm);

            
            res = Math.max(res, j-i+1);
        }
        
        return res;
    }

}