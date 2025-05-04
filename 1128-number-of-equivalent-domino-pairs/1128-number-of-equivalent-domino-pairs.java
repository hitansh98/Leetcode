class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        Map<Integer, Integer> hm = new HashMap<>();
        int res = 0;
        for(int[] domino: dominoes) {
            int stor = (Math.min(domino[0], domino[1]) * 10) + Math.max(domino[0], domino[1]);
            hm.put(stor, hm.getOrDefault(stor, 0) + 1);
        }

        for(int value: hm.values()) {
            res += value * (value - 1) / 2;
        }
        return res;
    }
}