class Solution {
    public int minMovesToMakePalindrome(String s) {
        char[] cArr = s.toCharArray();
        int len = cArr.length;
        int l = 0;
        int r = len-1;
        int count = 0;
        
        while(l<r){
            if(cArr[l] == cArr[r]){
                l++; r--;
            }
            else{
                int k = r;
                while(l<k && cArr[l] != cArr[k]){
                    k--;
                }
                
                if(k == l){
                    swap(cArr, l, l+1);
                    count++;
                }
                else{
                    while(k < r){
                        swap(cArr, k, k+1);
                        count++;
                        k++;
                    }
                    l++; r--;
                }
            }
        }
        
        return count;
        
    }
    
    public void swap(char[] ca, int a, int b){
        char temp = ca[a];
        ca[a] = ca[b];
        ca[b] = temp;
    }
}