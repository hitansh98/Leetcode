class Solution {
    public int[] singleNumber(int[] nums) {
        HashSet<Integer> hs = new HashSet<Integer>();
        for(int num: nums){
            if(hs.contains(num)){
                hs.remove(num);
            } else {
                hs.add(num);
            }
        }
        int[] res = new int[2];
        int i =0;
        Iterator<Integer> it = hs.iterator();
        while(it.hasNext()){
            res[i++] = it.next();
        }
        return res;
    }
}