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
        
        List<Integer> result = new ArrayList<Integer>();
        
        for(int i=listArr.length-1; i>0 && result.size() < k; i--){
            if(listArr[i]!=null){
                result.addAll(listArr[i]);
            }
        }
        
        int[] rArr = result.stream().mapToInt(i -> i).toArray();
        // Integer[] results = result.toArray();
        return rArr;
    }
}