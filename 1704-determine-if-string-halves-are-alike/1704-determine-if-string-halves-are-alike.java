class Solution {
    public boolean halvesAreAlike(String s) {
        HashSet<Character> c = new HashSet<Character>();
        
        s = s.toLowerCase();
        c.add('a');
        c.add('e');
        c.add('i');
        c.add('o');
        c.add('u');
        
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