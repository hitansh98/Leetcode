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
//     public int totalFruit(int[] tree) {
//         Map<Integer, Integer> count = new HashMap<>();
//         int i = 0, j;
//         for (j = 0; j < tree.length; ++j) {
//             count.put(tree[j], count.getOrDefault(tree[j], 0) + 1);
//             if (count.size() > 2) {
//                 count.put(tree[i], count.get(tree[i]) - 1);
//                 count.remove(tree[i++], 0);
//             }
//         }
//         return j - i;
//     }
    
//     public int totalFruit2(int[] tree) {
//         Map<Integer, Integer> count = new HashMap<Integer, Integer>();
//         int res = 0, i = 0;
//         for (int j = 0; j < tree.length; ++j) {
//             count.put(tree[j], count.getOrDefault(tree[j], 0) + 1);
//             while (count.size() > 2) {
//                 count.put(tree[i], count.get(tree[i]) - 1);
//                 if (count.get(tree[i]) == 0) count.remove(tree[i]);
//                 i++;
//             }
//             res = Math.max(res, j - i + 1);
//         }
//         return res;
//     }
}