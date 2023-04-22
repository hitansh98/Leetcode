class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        
        int len = people.length;
        
        int left = 0;
        int right = len-1;
        
        int res = 0;
        
        while(left<=right){
            if(left!=right){
                if(people[left] + people[right] <= limit){
                    res++;
                    left++;
                    right--;
                }

                else{
                    res++;
                    right--;
                } 
            }
            else{
                res++;
                left++;
            }
        }
        
        return res;
    }
}