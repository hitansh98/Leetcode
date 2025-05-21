class Solution {
    public void setZeroes(int[][] matrix) {
        Set<Integer> rowsToMark = new HashSet<>();
        Set<Integer> colsToMark = new HashSet<>();

        int m = matrix.length;
        int n = matrix[0].length;

        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                if(matrix[i][j] == 0) {
                    rowsToMark.add(i);
                    colsToMark.add(j);
                }
            }
        }

        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                if(rowsToMark.contains(i) || colsToMark.contains(j)) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}