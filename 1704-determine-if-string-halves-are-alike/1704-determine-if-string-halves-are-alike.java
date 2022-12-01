class Solution {
    public boolean halvesAreAlike(String s) {
        HashSet<Character> c = new HashSet<Character>();
        
        
        c.add('a');
        c.add('e');
        c.add('i');
        c.add('o');
        c.add('u');
        c.add('A');
        c.add('E');
        c.add('I');
        c.add('O');
        c.add('U');
        
        int mid = s.length()/2;
        
        int a = 0;
        int b = 0;
        for(int i=0;i<mid;i++){
            if(c.contains(s.charAt(i))){
                a++;
            }
            if(c.contains(s.charAt(mid+i))){
                b++;
            }
        }
        
        // System.out.println(a+" "+b);
        
        return a==b;
        
        
    }
}