class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> st = new Stack<Integer>(); 
        for(int i=0;i<ops.length;i++){
            if(ops[i].equals("+")){
                int temp = st.pop();
                int sum = st.peek()+temp;
                st.push(temp);
                st.push(sum);
            }
            else if(ops[i].equals("D")){
                st.push(2*st.peek());
            }
            else if(ops[i].equals("C")){
                st.pop();
            }
            else{
                st.push(Integer.parseInt(ops[i]));
            }
        }
        
        int res = 0;
        while(!st.isEmpty()){
            res+=st.pop();
        }
        
        return res;
    }
}