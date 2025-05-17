class Solution {
    public void sortColors(int[] nums) {
        int[] cnt = new int[3];
        for(int num: nums) {
            cnt[num]++;
        }

        int idx = 0;
        for(int i=0;i<cnt.length;i++) {
            while(cnt[i]-- > 0) {
                nums[idx++] = i;
            }
        }

        return;
    }
}