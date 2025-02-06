class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.equals(s2)) {
            return true;
        }
    
        int idx1 = -1;
        int idx2 = -1;
        int count = 0;

        for(int i=0;i<s1.length();i++) {
            char a = s1.charAt(i);
            char b = s2.charAt(i);

            if(a != b) {
                count++;
                if(idx1 == -1) idx1 = i;
                else if(idx2 == -1) idx2 = i;
                else return false;
            }
        }

        if(count == 2 && s1.charAt(idx1) == s2.charAt(idx2) && s1.charAt(idx2) == s2.charAt(idx1)) {
            return true;
        }

        return false;

    }
}