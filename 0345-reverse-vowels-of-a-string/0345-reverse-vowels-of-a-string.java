class Solution {
    public String reverseVowels(String s) {
        Set<Character> hs = new HashSet<Character>();
        hs.add('a');
        hs.add('e');
        hs.add('i');
        hs.add('u');
        hs.add('o');
        hs.add('A');
        hs.add('E');
        hs.add('I');
        hs.add('U');
        hs.add('O');
        int left = 0;
        int right = s.length()-1;
        char[] cArr = s.toCharArray();
        while(left<right){
            if(!hs.contains(cArr[left])){
                left++;
            }
               
            if(!hs.contains(cArr[right])){
                right--;
            }
               
            if(hs.contains(cArr[left]) && hs.contains(cArr[right])){
                char temp = cArr[left];
                cArr[left] = cArr[right];
                cArr[right] = temp;
                left++;
                right--;
            }
        }
        
        String res = new String(cArr);
        
        return res;
        
    }
}