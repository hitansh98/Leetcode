class Solution {
    public int orangesRotting(int[][] grid) {
        int fresh = 0;
        int minutes = 0;
        int r = grid.length;
        int c = grid[0].length;
        
        int[][] dirs = new int[][]{{0,-1},{-1,0},{1,0},{0,1}};
        Queue<int[]> queue = new LinkedList<int[]>();
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]==2){
                    queue.offer(new int[]{i,j});
                }
                
                else if(grid[i][j]==1){
                    fresh++;
                }
            }
        }
        
        // if(queue.isEmpty()) return -1;
        
        while(!queue.isEmpty() && fresh>0){
            int size = queue.size();
            for(int i=0;i<size;i++){
                int[] curr = queue.poll();
                
                for(int[] dir: dirs){
                    int x = curr[0] + dir[0];
                    int y = curr[1] + dir[1];
                    
                    
                    if(x<0 || y<0 || x>=r || y>=c){ //oob
                        continue;
                    }
                    
                    if(grid[x][y]==1){
                        grid[x][y]=2;
                        queue.offer(new int[]{x,y});
                        fresh--;
                    }
                }
            }
            minutes++;
        }
        
        if(fresh>0){
            return -1;
        }
        return minutes;
    }
}