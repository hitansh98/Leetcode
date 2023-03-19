class Solution {
    public void solve(char[][] board) {
        LinkedList<int[]> q = new LinkedList<>();
        int M = board.length-1;
        int N = board[0].length-1;
        int[][] vis = new int[M+1][N+1];
        
        //edge rows O to +
        for(int i=0;i<=M;i++){
            if(board[i][0] == 'O'){
                board[i][0] = '+';
                // System.out.println(i+"  0");
                q.offer(new int[]{i,0});
                // vis[i][0] = 1;
            }
            
            if(board[i][N] == 'O'){
                board[i][N] = '+';
                // System.out.println(i+"  "+N);
                q.offer(new int[]{i,N});
                // vis[i][N] = 1;
            }
        }
        
        //edge cols O to +
        for(int j=0;j<=N;j++){
            if(board[0][j] == 'O'){
                board[0][j] = '+';
                // System.out.println("0  "+j);
                q.offer(new int[]{0,j});
                // vis[0][j] = 1;
            }
            
            if(board[M][j] == 'O'){
                board[M][j] = '+';
                // System.out.println(M+"  "+j);
                q.offer(new int[]{M,j});
                // vis[M][j] = 1;
            }
        }
        
        // System.out.println(q.peek());
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                
               // System.out.print(board[i][j]+" ");
            }
            // System.out.println();
        }
        
        //bfs of these edge '+''s.
        
        while(!q.isEmpty()){
            int size = q.size();
            
            for(int i=0;i<size;i++){
                int[] curr = q.poll();
                
                int x = curr[0];
                int y = curr[1];
                
                // System.out.println(Arrays.toString(curr));
                
                if(x<0 || x>M || y<0 || y>N || vis[x][y] == 1 || board[x][y] == 'X'){
                    // System.out.println(Arrays.toString(curr));
                    continue;
                }
                
                // System.out.println(Arrays.toString(curr));
                
                board[x][y] = '+';
                vis[x][y] = 1;
                
                q.offer(new int[]{x+1, y});
                q.offer(new int[]{x-1, y});
                q.offer(new int[]{x, y+1});
                q.offer(new int[]{x, y-1});
            }
        }
        
        
//         for(int i=0;i<board.length;i++){
//             for(int j=0;j<board[0].length;j++){
                
//                System.out.print(board[i][j]+" ");
//             }
//             System.out.println();
//         }
        
        
        
        //convert the + to O's and the 'O's to 'X's
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                
                if(board[i][j] == 'O'){
                    board[i][j] = 'X';
                }
                else if(board[i][j] == '+'){
                    board[i][j] = 'O';
                }
            }
        }
        
        
    }
}