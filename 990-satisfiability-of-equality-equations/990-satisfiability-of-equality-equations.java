class Solution {
    public int filler = 1;
    public boolean equationsPossible(String[] equations) {
        int[] arr = new int[26];
        Arrays.fill(arr, -1);
        
        boolean res, res2 = false;
        for(String equation: equations){
            char operand1 = equation.charAt(0);
            char operand2 = equation.charAt(3);
            char operator = equation.charAt(1);
            
            res = resolver(arr, operand1, operand2, operator);
        }
        
        
        for(String equation: equations){
            char o1 = equation.charAt(0);
            char o2 = equation.charAt(3);
            char op = equation.charAt(1);
        
            
            if(op=='!'){
                
                // System.out.println(Arrays.toString(arr));
                
                if(o1==o2){
                    return false;
                }
                if(arr[o1-'a']==-1 || arr[o2-'a'] ==-1){
                    continue;
                }
                
                if(arr[o1-'a']==arr[o2-'a']){
                    return false;
                }
                
                
                else{
                    continue;
                }
                
                
            }
        }
        
    return true;

    }
        

    
    public boolean resolver(int[] arr, char o1, char o2, char op){
        
        if(op=='='){
            if(arr[o1-'a']==-1 && arr[o2-'a'] ==-1){
                arr[o1-'a'] = filler;
                arr[o2-'a'] = filler;
                filler++;
            }


            else if(arr[o1-'a']==-1){
                arr[o1-'a'] = arr[o2-'a'];
            }

            else if(arr[o2-'a']==-1){
                arr[o2-'a'] = arr[o1-'a'];
            }

            else if(arr[o1-'a'] == arr[o2-'a']){
                
            }
            
            else{
                int minVal = Math.min(arr[o1-'a'], arr[o2-'a']);
                int maxVal = Math.max(arr[o1-'a'], arr[o2-'a']);
                for(int i=0;i<26;i++){
                    if(arr[i]==maxVal){
                        arr[i] = minVal;
                    }
                }
            }
        }
        
        else{
            if(arr[o1-'a']==-1 || arr[o2-'a'] ==-1){
                return true;
            }
            
            
            if(arr[o1-'a']==arr[o2-'a']){
                return false;
            }
            
            return true;
        }
        
        return true;
    }
}