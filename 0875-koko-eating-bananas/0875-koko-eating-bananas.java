class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = 0;
        for(int pile: piles){
            max = Math.max(max, pile);
        }
        
        int low = 1;
        int high = max;
        // int ans = Integer.MAX_VALUE;
        
        while(low < high){
            int mid = (high-low)/2 + low;
            
            int hrs = 0;
            for(int pile:piles){
                // System.out.print("Adding pile "+pile+"....");
                
                if(pile<mid){
                    hrs+=1;
                }
                else{
                    
                    int rem = pile%mid;
                    if(rem>0){
                        hrs+=1;
                    }
                    hrs+= (pile/mid);
                }
                // System.out.println(" in time "+hrs);
            }
            
            // System.out.println(mid+" "+hrs);
            
            if(hrs > h){
                low = mid+1;
            }
            else{
                high = mid;
            }
        }
        
        return low;
    }
}