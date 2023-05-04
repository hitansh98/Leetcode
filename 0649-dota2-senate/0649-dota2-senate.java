class Solution {
    public String predictPartyVictory(String senate) {
        int rCount = 0;
        int dCount = 0;
        
        int rSkip = 0;
        int dSkip = 0;
        
        char[] senArr = senate.toCharArray();
        
        for(int sen: senArr){
            if(sen == 'D'){
                dCount++;
            }
            else if(sen == 'R'){
                rCount++;
            }
        }
        
        int[] skipSet = new int[senate.length()];
        String res = "";
        
        while(res.length() == 0){
            for(int i=0;i<senArr.length;i++){
                if(skipSet[i] == 1){
                    continue;
                }
                
                if(senArr[i] == 'D'){
                    if(dSkip > 0){
                        skipSet[i] = 1;
                        dSkip--;
                        dCount--;
                    }
                    else{
                        rSkip++;
                    }
                }
                else{
                    if(rSkip > 0){
                        skipSet[i] = 1;
                        rSkip--;
                        rCount--;
                    }
                    else{
                        dSkip++;
                    }
                }
                
                if(dCount == 0){
                    res = "Radiant";
                }
                
                else if(rCount == 0){
                    res = "Dire";
                }
            }
        }
        
        return res;
    }
}