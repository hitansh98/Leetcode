class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
//         Map<Integer, Integer> hm1 = new HashMap<>();
//         Map<Integer, Integer> hm2 = new HashMap<>();
        
//         for(int num: nums1){
//             int val = hm1.getOrDefault(num, 0);
//             hm1.put(num, val+1);
//         }
        
//         for(int num: nums2){
//             int val = hm2.getOrDefault(num, 0);
//             hm2.put(num, val+1);
//         }
        
//         List<Integer> res = new ArrayList<>();
//         for(int key: hm1.keySet()){
//             if(hm2.containsKey(key)){
//                 int count = Math.min(hm1.get(key), hm2.get(key));
//                 while(count-->0){
//                     res.add(key);
//                 }
//             }
//         }
        
//         int[] result = new int[res.size()];
//         int ptr = 0;
        
//         for(int num: res){
//             result[ptr++] = num;
//         }
        
//         return result;
        
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        if(nums1.length < nums2.length){
            int[] temp = nums1;
            nums1 = nums2;
            nums2 = temp;
        }
        
        int left = 0;
        int right = 0;
        List<Integer> res = new ArrayList<>();
        
        while(left < nums1.length && right < nums2.length){
            if(nums1[left] != nums2[right]){
                if(nums1[left] < nums2[right]){
                    left++;
                }
                else{
                    right++;
                }
            }

            else{
                res.add(nums1[left]);
                left++;
                right++;
            }
        }
        
        int[] result = new int[res.size()];
        int ptr = 0;
        
        for(int num: res){
            result[ptr++] = num;
        }
        
        return result; 
    }
}