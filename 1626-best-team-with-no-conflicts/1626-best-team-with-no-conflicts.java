class Solution {
    public int bestTeamScore(int[] scores, int[] ages) {
        
        int[][] pArr = new int[ages.length][2];
        // Pair[] pArr = new Pair[ages.length];
        int maxAge = 0;
        for(int i=0;i<ages.length;i++){
            pArr[i][0] = ages[i];
            pArr[i][1] = scores[i];
            maxAge = Math.max(maxAge, ages[i]);
        }
        
        int[][] dp = new int[ages.length+1][maxAge+1];
        
        Arrays.sort(pArr, (a,b)->a[1] == b[1] ? a[0]-b[0] : a[1]-b[1]);
        
        // System.out.println(Arrays.toString(pArr));
        // for(int i=0;i<pArr.length;i++){
        //     System.out.println(pArr[i].age+" "+pArr[i].score);
        // }
        
        return helper(pArr, dp, 0, 0);
    }
    
    public int helper(int[][] pArr, int[][] dp, int index, int maxAge){
        if(index>=pArr.length){
            return 0;
        }
        
        
        if(dp[index][maxAge] != 0){
            return dp[index][maxAge];
        }
        
        
        if(pArr[index][0]>=maxAge){
            
            int x1 = helper(pArr, dp, index+1, maxAge);  //do not consider
            int x2 = pArr[index][1] + helper(pArr, dp, index+1, pArr[index][0]);
            
            dp[index][maxAge] = Math.max(x1,x2);
        }
        else{
            dp[index][maxAge] = helper(pArr, dp, index+1, maxAge);
        }
        
        
        return dp[index][maxAge];
        
    }
}

// class Pair{
//     int age;
//     int score;
    
//     public Pair(int age, int score){
//         this.age = age;
//         this.score = score;
//     }
// }