class Solution { 
    private static final int[][] DIRECTIONS = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    public int minimumEffortPath(int[][] heights) {
        int m = heights.length, n = heights[0].length;
        
        // efforts[x][y] : effort of reaching (x,y) from (0,0)
        int[][] efforts = new int[m][n];
        for (int[] effort : efforts) Arrays.fill(effort, Integer.MAX_VALUE);
        efforts[0][0] = 0;
        
        // min-heap storing triplets {x, y, effort of reaching (x,y) from (0,0) }
        PriorityQueue<int[]> heap = new PriorityQueue<>((a,b) -> a[2] - b[2]);
        heap.offer(new int[]{0, 0, 0});
        
       
        while (!heap.isEmpty()) {
            int[] curr = heap.poll();
            int x = curr[0], y = curr[1], eff = curr[2];
            
            if (x == m-1 && y == n-1) return eff;
            
            for (int[] dir : DIRECTIONS) {
                int newX = x + dir[0], newY = y + dir[1];
                if (newX < 0 || newY < 0 || newX >= m || newY >= n) continue;
                
                // effort to reach {newX, newY} from {x,y}, 
                int newEff = Math.max(eff, Math.abs(heights[x][y] - heights[newX][newY]));
                if (efforts[newX][newY] > newEff) {
                    efforts[newX][newY] = newEff;
                    heap.offer(new int[]{newX, newY, newEff});
                }
            }
        }
        
        return 0;
    }
}