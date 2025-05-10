class Solution {
    public long minSum(int[] nums1, int[] nums2) {
        long firstSum = 0;
        long secondSum = 0;
        long firstCount = 0;
        long secondCount = 0;
        for(int num: nums1) {
            firstSum += num;
            if(num == 0) {
                firstCount++;
            }
        }

        for(int num: nums2) {
            secondSum += num;
            if(num == 0) {
                secondCount++;
            }
        }
        long min1 = firstSum + firstCount;
        long min2 = secondSum + secondCount;

        if(firstCount == 0 && secondCount == 0) {
            return firstSum == secondSum ? firstSum : -1;
        }

        else if(firstCount == 0) {
            return min2 <=  firstSum ? firstSum : -1;
        }

        else if(secondCount == 0) {
            return min1 <= secondSum ? secondSum : -1;
        }


        return Math.max(min1, min2);
    }
}