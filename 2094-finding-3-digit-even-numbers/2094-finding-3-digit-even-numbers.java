class Solution {
    public int[] findEvenNumbers(int[] digits) {
        List<Integer> res = new ArrayList<>();
        int[] map = new int[10];

        for (int digit : digits) {
            map[digit]++;
        }

        for (int i = 1; i <= 9; i++) {
            if (map[i] == 0) {
                continue;
            }
            map[i]--;
            for (int j = 0; j <= 9; j++) {
                if (map[j] == 0) {
                    continue;
                }
                map[j]--;
                for (int k = 0; k < 9; k += 2) {
                    if (map[k] == 0) {
                        continue;
                    }
                    res.add(100 * i + 10 * j + k);
                }
                map[j]++;
            }
            map[i]++;
        }

        int[] resArr = new int[res.size()];
        int idx = 0;
        Iterator<Integer> it = res.iterator();
        while (it.hasNext()) {
            int num = Integer.valueOf(it.next());
            resArr[idx++] = num;
        }

        return resArr;
    }
}