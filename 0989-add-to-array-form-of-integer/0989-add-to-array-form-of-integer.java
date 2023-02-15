class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        int carry = 0;
        List<Integer> res = new ArrayList<Integer>();
        int kVal;
        
        for(int i=num.length-1;i>-1;i--){
            kVal = 0;
            if(k>0){
                kVal = k%10;
                k/=10;
            }
           
            
            // num[i] = Integer.valueOf(numStr.charAt(i));
            int val = num[i]+carry+kVal;
            carry = val/10;
            res.add(0, val%10);
        }
        
        while(k>0 || carry==1){
            kVal = 0;
            if(k>0){
                kVal = k%10;
                k/=10;
            }
            
            int val = kVal+carry;
            carry = val/10;
            res.add(0, val%10);
        }
        
        // System.out.println(Arrays.toString(numArray));
        
        return res;
        
        
        
    }
}