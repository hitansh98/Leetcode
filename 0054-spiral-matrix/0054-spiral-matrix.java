class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int left = 0;
        int right = matrix[0].length - 1;
        int top = 0;
        int bottom = matrix.length - 1;
        
        int ptr = 0;
        int[][] dir = new int[][]{{0,1},{1,0},{0,-1},{-1,0}};
        
        int curr_x = 0;
        int curr_y = 0;
        
        int num = 1;
        int totalCount = matrix.length * matrix[0].length;
        
        List<Integer> res = new ArrayList<>();
        res.add(matrix[curr_x][curr_y]);
        
        while(num != totalCount){
            int temp = ptr % 4;
            int new_x = curr_x + dir[temp][0];
            int new_y = curr_y + dir[temp][1];
            
            if(new_x < top || new_x > bottom || new_y < left || new_y > right){
                if(temp == 0){
                    top++;
                }
                
                else if(temp == 1){
                    right--;
                }
                
                else if(temp == 2){
                    bottom--;
                }
                
                else if(temp == 3){
                    left++;
                }
                ptr++;
                // System.out.println("1");
            }
            
            else{
                res.add(matrix[new_x][new_y]);
                num++;
                
                curr_x = new_x;
                curr_y = new_y;
                
                // System.out.println("2");
            }
        }
        
        return res;
    }
}