class Solution {
    public int orangesRotting(int[][] grid) {
        int fresh = 0;
        int time = 0;
        LinkedList<int[]> q = new LinkedList<int[]>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    fresh++;
                }
                
                if(grid[i][j]==2){
                    q.offer(new int[]{i,j});
                }
            }
        }
        
        int[][] dirs = new int[][]{{0,-1}, {0, 1}, {1, 0}, {-1,0}};
        int[][] visited = new int[grid.length][grid[0].length];
        
        while(!q.isEmpty() && fresh>0){
            int size = q.size();
            
            for(int i=0;i<size;i++){
                int[] curr = q.poll();
                
                for(int[] dir: dirs){
                    int xcord = curr[0] + dir[0];
                    int ycord = curr[1] + dir[1];
                    
                    if(xcord<0 || ycord<0 || xcord>=grid.length || ycord >=grid[0].length) continue;
                    if(grid[xcord][ycord]==1 && visited[xcord][ycord]==0){
                        fresh--;
                        q.offer(new int[]{xcord, ycord});
                        grid[xcord][ycord] = 2;
                    }
                    
                    visited[xcord][ycord] = 1;
                }
            }
            time++;
        }
        
        if(fresh>0) return -1;
        return time;
    }
}