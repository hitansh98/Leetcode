class Solution {
    int res;
    public int numIslands(char[][] grid) {
        res = 0;
        char[][] visited = new char[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j] == '1' && visited[i][j] != '1'){
                    // System.out.println(i+" "+j);
                    bfs(grid, visited, i, j);   
                    ++res;
                }                
            }
        }
        
        
        return res;
    }
    
    public void bfs(char[][] grid, char[][] visited, int i, int j){
        // System.out.println(i+" "+j);
        LinkedList<int[]> q = new LinkedList<>();
        q.push(new int[]{i, j});
        while(!q.isEmpty()){
            int size = q.size();
            
            for(int m=0;m<size;m++){
                int[] curr = q.poll();
                if(curr[0]==grid.length-1 && curr[1] == grid[0].length-1){
                    // System.out.println("reached");
                }
                if(curr[0] < 0 || curr[0] >= grid.length || curr[1] < 0 || curr[1] >= grid[0].length || visited[curr[0]][curr[1]] == '1' || grid[curr[0]][curr[1]] != '1'){
                    continue;
                } 
                
                
                visited[curr[0]][curr[1]] = '1';
                
                q.offer(new int[]{curr[0] + 1, curr[1]});
                q.offer(new int[]{curr[0] - 1, curr[1]});
                q.offer(new int[]{curr[0], curr[1] + 1});
                q.offer(new int[]{curr[0], curr[1] - 1});
                
            }
        }
        
    }
}