class Solution {
    public int findJudge(int n, int[][] trust) {
        
        if(trust.length==0){
            if(n==1){
                return 1;
            }
            return -1;
        }
        
        int[] voteArray = new int[n+1];
        
        for(int i=0;i<trust.length;i++){
            voteArray[trust[i][0]]--;
            voteArray[trust[i][1]]++;
        }
        
        
        for(int i=0;i<voteArray.length;i++){
            if(voteArray[i]==n-1){
                return i;
            }
        }
        
        return -1;
    }
}