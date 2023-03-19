class Solution {
    public int orangesRotting(int[][] grid) {
        int freshCount = 0;
        int rotCount = 0;
        int time=-1;
        
        LinkedList<int[]> q = new LinkedList<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j] == 1){
                    freshCount++;
                }
                else if(grid[i][j] == 2){
                    q.offer(new int[]{i, j});
                    rotCount++;
                }
            }
        }
        
        if(freshCount == 0) return 0;
        // System.out.println(q);
        
        int[][] visited = new int[grid.length][grid[0].length];
        
        
        while(freshCount > 0 && !q.isEmpty()){
            time += 1;
            int size = q.size();
            System.out.println(time);
            for(int i=0;i<size;i++){
                int[] curr = q.poll();
                int x = curr[0];
                int y = curr[1];
                // System.out.println(x+" "+y);
                if(x<0 || x>=grid.length || y<0 || y>=grid[0].length || visited[x][y] == 1 || grid[x][y] == 0){
                    continue;
                }
                if(grid[x][y] == 1){
                    freshCount--;
                    System.out.println(x+" "+y+" "+time);
                }
                
                grid[x][y] = 2;
                visited[x][y] = 1;
                
                
                q.offer(new int[]{x+1, y});
                q.offer(new int[]{x-1, y});
                q.offer(new int[]{x, y-1});
                q.offer(new int[]{x, y+1});
            }
            
            
            
        }
        
        return freshCount == 0 ? time : -1;
        
    }
    
}