class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<Integer>();
        for(int i=0;i<tokens.length;i++){
            if(!tokens[i].equals("+") && !tokens[i].equals("-") && !tokens[i].equals("*") && !tokens[i].equals("/")){
                Integer num = Integer.valueOf(tokens[i]);
                st.push(num);
            }
            else if(tokens[i].equals("+")){
                int op2 = st.pop();
                int op1 = st.pop();
                int res = op1 + op2;
                st.push(res);
            }
            
            else if(tokens[i].equals("-")){
                int op2 = st.pop();
                int op1 = st.pop();
                int res = op1 - op2;
                st.push(res);
            }
            
            else if(tokens[i].equals("*")){
                int op2 = st.pop();
                int op1 = st.pop();
                int res = op1 * op2;
                st.push(res);
            }
            
            else if(tokens[i].equals("/")){
                int op2 = st.pop();
                int op1 = st.pop();
                int res = op1 / op2;
                st.push(res);
            }
        }
        return st.pop();
    }
}