class Solution {
    public String triangleType(int[] nums) {
        Set<Integer> hs = new HashSet<>();
        int maxTillNow = -1;
        int totalSum = 0;

        for(int i=0;i<nums.length;i++) {
            totalSum += nums[i];
            maxTillNow = Math.max(nums[i], maxTillNow);
            hs.add(nums[i]);
        }

        for(int i=0;i<nums.length;i++) {
            if(totalSum - nums[i] <= maxTillNow) {
                return new String("none");
            }
        }


        int size = hs.size();
        if(size == 1) {
            return new String("equilateral");
        } else if(size == 2) {
            return new String("isosceles");
        }
        return new String("scalene");
    }
}