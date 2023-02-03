class Solution {
    public String convert(String s, int numRows) {
        char[][] cArr = new char[numRows][s.length()];
        if(numRows == 1) return s;
        
        int index = 0;
        boolean flag = true;
        int row = 0;
        int col = 0;
        while(index<s.length()){
            if(flag){
                cArr[row][col] = s.charAt(index);
                if(row==numRows-1){
                    flag = false;
                    col++;
                    row--;
                }
                else{
                    row++;
                }
            }
            else{
                cArr[row][col] = s.charAt(index);
                
                if(row==0){
                    flag = true;
                    row++;
                }
                else{
                    col++;
                    row--;
                }
            }
            
            index++;
            
        }
        String res = "";
        for(int i=0;i<cArr.length;i++){
            for(int j=0;j<cArr[0].length;j++){
                if(cArr[i][j] != 0){
                    res += cArr[i][j];    
                }
                // System.out.print(cArr[i][j]+" ");
            }
            // System.out.println();
        }
        
        return res;
    }
}