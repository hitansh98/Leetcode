class Solution {
    public int[] minOperations(String boxes) {
        int n = boxes.length();
        int[] leftSums = new int[n];
        int[] rightSums = new int[n];

        int[] cumLeft = new int[n];
        int[] cumRight = new int[n];

        int[] res = new int[n];

        leftSums[0] = boxes.charAt(0) == '1' ? 1 : 0;
        cumLeft[0] = 0; 
        rightSums[n-1] = boxes.charAt(n-1) == '1' ? 1 : 0;
        cumRight[n-1] = 0;

        for(int i=1;i<n;i++) {
            leftSums[i] += boxes.charAt(i) == '1' ? 1 : 0;
            leftSums[i] += leftSums[i-1];
            cumLeft[i] += cumLeft[i-1] + leftSums[i-1];

            rightSums[n-i-1] += boxes.charAt(n-i-1) == '1' ? 1 : 0;
            rightSums[n-i-1] += rightSums[n-i];
            cumRight[n-i-1] += cumRight[n-i] + rightSums[n-i];
        }

        for(int i=0;i<n;i++) {
            res[i] = cumLeft[i] + cumRight[i];
        }

        // System.out.println(Arrays.toString(leftSums));
        // System.out.println(Arrays.toString(rightSums));

        // System.out.println(Arrays.toString(cumLeft));
        // System.out.println(Arrays.toString(cumRight));

        return res;
    }
}