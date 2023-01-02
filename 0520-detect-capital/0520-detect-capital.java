class Solution {
    public boolean detectCapitalUse(String word) {
        if(word.length()<2) return true;
        
        char[] cArr = word.toCharArray();
        
        if(isCapital(cArr[0]) && isCapital(cArr[1])){
            for(int i=2;i<cArr.length;i++){
                // System.out.println("1");
                if(!isCapital(cArr[i])) return false;
            }
        }
        else{
            for(int i=1;i<cArr.length;i++){
                // System.out.println("2");
                
                if(isCapital(cArr[i])) return false;
            }
        }
        
        return true;
    }
    
    public boolean isCapital(char c){
        // System.out.println(c-'A');
        return (c-'A') < 27;
    } 
}