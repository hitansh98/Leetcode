class Solution {
    public int differenceOfSums(int n, int m) {
        int totalSum = n * (n+1) / 2;

        int largestQuotient = n / m;
        int divisibleSum = m * (largestQuotient) * (largestQuotient + 1) / 2;

        return totalSum - (2 * divisibleSum); 
    }
}