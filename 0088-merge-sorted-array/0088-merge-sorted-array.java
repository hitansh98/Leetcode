class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int first = m-1;
        int second = n-1;
        int curr = m+n-1;
        
        while(curr >= 0){
            
            while(first>=0 && second>=0){
                if(nums1[first] > nums2[second]){
                    nums1[curr] = nums1[first];
                    curr--;
                    first--;
                }
                else{
                    nums1[curr] = nums2[second];
                    curr--;
                    second--;
                }
            }
            
            
            while(first>=0){
                nums1[curr] = nums1[first];
                curr--;
                first--;
            }
            
            while(second>=0){
                nums1[curr] = nums2[second];
                curr--;
                second--;
            }
            
        }
    }
}