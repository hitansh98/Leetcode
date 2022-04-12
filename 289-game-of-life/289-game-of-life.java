class Solution {
    public void gameOfLife(int[][] board) {
        // int[][] copy = new int[board.length][board[0].length];
        
        
        int[] dx = new int[]{0, 0, 1, 1, 1, -1, -1, -1};
        int[] dy = new int[]{1, -1, -1, 0, 1, -1, 0, 1};
        
        
        
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                int live = 0;
                for(int a = 0; a<8; a++){
                    int nex = i + dx[a];
                    int ney = j + dy[a];
                    
                    if(isValidNeighbour(board, nex, ney) && Math.abs(board[nex][ney])==1){
                        live++;
                    }
                }
                
                if(board[i][j] == 1 && (live<2 || live>3)){
                    board[i][j] = -1;
                }
                
                else if(board[i][j] == 0 && live==3){
                    board[i][j] = 2; 
                }
                
            }
        }
        
        for(int i=0;i<board.length; i++){
            for(int j=0;j<board[0].length; j++){
                if(board[i][j]>=1){
                    board[i][j] = 1;
                }
                else{
                    board[i][j] = 0;
                }
            }
        }
    }
    
    public boolean isValidNeighbour(int[][] board, int i, int j){
        
        if(i>=0 && j>=0 && i<board.length && j<board[0].length){
            return true;
        }
        return false;
    }
    
    
   
}