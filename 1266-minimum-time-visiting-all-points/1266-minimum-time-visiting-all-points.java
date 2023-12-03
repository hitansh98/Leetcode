class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int count = 0;
        for(int i=0;i<points.length - 1;i++){
            count += bfs(points, i);
        }
        return count;
    }

    public int bfs(int[][] points, int idx){
        int moves = 0;
        moves += Math.max(Math.abs(points[idx+1][0]-points[idx][0]),Math.abs(points[idx+1][1]-points[idx][1]));
        return moves;
    }
}