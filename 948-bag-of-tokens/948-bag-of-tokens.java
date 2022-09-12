class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        
        Arrays.sort(tokens);
        //can play token only once. Have to maintain visited array.
        
        int start = 0;
        int end = tokens.length-1;
        
        int points = 0;
        int result = 0;
        
        while(start<=end){
            if(tokens[start]<=power){
                power -= tokens[start++];
                result = Math.max(result, ++points);
            }
            else if(points>0){
                power += tokens[end--];
                points--;
            }
            else{
                break;
            }
        }
        
        return result;
    }
}