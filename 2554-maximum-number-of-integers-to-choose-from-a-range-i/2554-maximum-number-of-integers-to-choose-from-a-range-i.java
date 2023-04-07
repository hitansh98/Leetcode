class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        Set<Integer> hs = new HashSet<>();
        for(int ban: banned){
            hs.add(ban);
        }
        
        int sum=0;
        int count = 0;
        for(int i=1;i<=n;i++){
            if(hs.contains(i)){
                continue;
            }
            
            if(sum + i > maxSum){
                continue;
            }
            
            sum = sum + i;
            count++;
        }
        
        return count;
    }
}