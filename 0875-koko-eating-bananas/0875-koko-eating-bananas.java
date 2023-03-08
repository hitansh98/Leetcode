class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = 0;
        for(int pile: piles){
            max = Math.max(max, pile);
        }
        
        int low = 1;
        int high = max;
        
        while(low<high){
            int mid = (high-low)/2 + low;
            int need = 0;
            
            for(int pile: piles){
                need += pile/mid;
                if(pile%mid!=0){
                    need+=1;
                }
            }
            
            if(need > h){
                low = mid+1;
            }
            else
            {
                high = mid;
            }
            
        }
        
        return low;
    }
    
}