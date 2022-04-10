class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> st = new Stack<Integer>(); 
        int res1 = 0;
        for(int i=0;i<ops.length;i++){
            if(ops[i].equals("+")){
                int temp = st.pop();
                int sum = st.peek()+temp;
                st.push(temp);
                st.push(sum);
                res1+=sum;
            }
            else if(ops[i].equals("D")){
                res1 += 2*st.peek();
                st.push(2*st.peek());
            }
            else if(ops[i].equals("C")){
                res1 -= st.peek();
                st.pop();
            }
            else{
                res1 += Integer.parseInt(ops[i]);
                st.push(Integer.parseInt(ops[i]));
            }
        }
        return res1;
    }
}