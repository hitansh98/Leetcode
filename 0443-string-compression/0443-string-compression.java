class Solution {
    public int compress(char[] chars) {
        int count = 1;
        int res = 0;
        int ptr = 0;
        char next;
        
        if(chars.length==1) return chars.length;
        
        for(int i=0;i<chars.length;i++){
            if(i==chars.length-1){
                if(chars[i-1]!=chars[i]){
                    chars[ptr++] = chars[i];
                }
                else{
                    chars[ptr++] = chars[i];
                    String counter = count + "";
                    for(char coun: counter.toCharArray()){
                        chars[ptr++] = coun;
                    }
                    count=1;
                }
            }
            else{
                next = chars[i+1];
                if(next==chars[i]){
                    count++;
                    continue;
                }
                else{

                    res+=1;
                    chars[ptr++] = chars[i];
                    if(count>1){
                        String counter = count + "";
                        for(char coun: counter.toCharArray()){
                            chars[ptr++] = coun;
                        }
                    }
                    count=1;
                }
            }
            
            
        }
        
        
        return ptr;
    }
}