class Solution {
    List<Integer> tester;
    Integer[][] dp;
    public int longestIncreasingPath(int[][] grid) {
        tester = new ArrayList<Integer>();
        dp = new Integer[grid.length][grid[0].length];
        int max = 1;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                // System.out.println("for: "+grid[i][j]);
                max = Math.max(max, 1 + dfs(grid, new boolean[grid.length][grid[0].length], i, j));
                // System.out.println("max so far: "+max);
                
            }
        }
        
        return max;
    }
    
    public int dfs(int[][] grid, boolean[][] visited, int i, int j){
        if(i<0 || j<0 || i>= grid.length || j>=grid[0].length || visited[i][j]==true){
            return 0;
        }
        
        visited[i][j] = true;
        int left = 0;
        int right = 0;
        int top = 0;
        int down = 0;
        if(i!=0){
            if(grid[i-1][j] > grid[i][j]){
                if(dp[i-1][j]==null){
                    dp[i-1][j] = dfs(grid, visited, i-1, j);
                }
                top = 1 + dp[i-1][j];
                // tester.add(grid[i-1][j]);
                // System.out.println(grid[i][j] +" "+ top);
            }
        }
        
        if(i!=grid.length-1){
            if(grid[i+1][j] > grid[i][j]){
                if(dp[i+1][j]==null){
                    dp[i+1][j] = dfs(grid, visited, i+1, j);
                }
                down = 1 + dp[i+1][j];
                // tester.add(grid[i+1][j]);
                // System.out.println(grid[i][j] +" "+ down);
            }
        }
        
        if(j!=0){
            if(grid[i][j-1] > grid[i][j]){
                if(dp[i][j-1]==null){
                    dp[i][j-1] = dfs(grid, visited, i, j-1);
                }
                left = 1 + dp[i][j-1];
                // tester.add(grid[i][j-1]);
                // System.out.println(grid[i][j] +" "+ left);
            }
        }
        
        if(j!=grid[0].length-1){
            if(grid[i][j+1] > grid[i][j]){
                if(dp[i][j+1]==null){
                    dp[i][j+1] = dfs(grid, visited, i, j+1);
                }
                right = 1 + dp[i][j+1];
                // tester.add(grid[i][j+1]);
                // System.out.println("going right: ");
                // System.out.println(grid[i][j] +" "+ right);
            }
        } 
        
        return maxOfFour(left, right, top, down);
    }
    
    public int maxOfFour(int a, int b, int c, int d){
        return Math.max(Math.max(a,b), Math.max(c,d));
    }
}