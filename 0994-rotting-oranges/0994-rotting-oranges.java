class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<Pair> q = new LinkedList<>();
        int[][] visited = new int[grid.length][grid[0].length];
        boolean spoiled = false;
        int fresh = 0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==2){
                    q.offer(new Pair(i,j));
                }
                
                if(grid[i][j]==1){
                    fresh++;
                }
            }
        }
        
        
        if(fresh==0) return 0;
        if(q.isEmpty()) return -1;
        int[] xdirs = new int[]{-1,1,0,0};
        int[] ydirs = new int[]{0,0,-1,1};
        int time = 0;
        while(!q.isEmpty() && fresh>0){
            int size = q.size();
            for(int i=0;i<size;i++){
                Pair curr = q.poll();
                for(int j=0;j<4;j++){
                    int xcoord = curr.first + xdirs[j];
                    int ycoord = curr.second + ydirs[j];
                    
                    if(xcoord<0 || ycoord<0 || xcoord>=grid.length || ycoord>=grid[0].length || visited[xcoord][ycoord] == 1){
                        continue;
                    }
                    if(grid[xcoord][ycoord] == 1){
                        grid[xcoord][ycoord] = 2;
                        fresh--;
                        q.offer(new Pair(xcoord, ycoord));
                    }
                    visited[xcoord][ycoord] = 1;
                }
            }
            time++;
            // System.out.println(time+" "+q.toString());
        }
        
        // for(int i=0;i<grid.length;i++){
        //     for(int j=0;j<grid[0].length;j++){
        //         System.out.print(grid[i][j]+" ");
        //     }
        //     System.out.println();
        // }
        
        
        if(fresh>0){
            return -1;
        }
        return time;
    }
    
    
}

public class Pair{
    int first;
    int second;
    
    Pair(int first, int second){
        this.first = first;
        this.second = second;
    }
}