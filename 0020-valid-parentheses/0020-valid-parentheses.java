class Solution {
    public boolean isValid(String s) {
        char[] chars = s.toCharArray();
        Stack<Character> st = new Stack<Character>();
        for(int i=0;i<s.length();i++){
            if(chars[i] == '{' || chars[i] == '[' || chars[i] == '('){
                st.push(chars[i]);
            }
            
            else if(chars[i] == '}'){
                if(!st.isEmpty() && st.peek() == '{'){
                    st.pop();
                }
                else{
                    return false;
                }
            }
            
            else if(chars[i] == ']'){
                if(!st.isEmpty() && st.peek() == '['){
                    st.pop();
                }
                else{
                    return false;
                }
            }
            
            else if(chars[i] == ')'){
                if(!st.isEmpty() && st.peek() == '('){
                    st.pop();
                }
                else{
                    return false;
                }
            }
        }
        
        return st.isEmpty() ? true: false;
    }
}