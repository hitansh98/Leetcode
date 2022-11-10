class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<Character>();
        String res = "";
        
        for(int i=0;i<s.length();i++){
            if(!st.isEmpty() && st.peek()==s.charAt(i)){
                st.pop();
                res = res.substring(0, res.length()-1);
            }
            else{
                st.push(s.charAt(i));
                res += s.charAt(i);
            }
        }
        return res;
    }
}