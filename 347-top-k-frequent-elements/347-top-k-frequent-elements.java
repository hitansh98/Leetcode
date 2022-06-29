class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer>[] listArr = new List[nums.length+1];
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        for(int num: nums){
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }
        
        for(int ele: hm.keySet()){
            int val = hm.get(ele);
            if(listArr[val]==null){
                listArr[val] = new ArrayList<Integer>();
            }
            listArr[val].add(ele);
        }
        
        int[] rArr = new int[k];
        
        for(int i=listArr.length-1, ptr=0; i>0 && ptr<k; i--){
            if(listArr[i]!=null){
                for(int elem: listArr[i]){
                    rArr[ptr] = elem;
                    ptr++;
                }
            }
        }
        
        return rArr;
    }
}