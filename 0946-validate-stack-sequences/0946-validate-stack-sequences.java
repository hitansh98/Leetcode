class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> st = new Stack<Integer>();
        int ptr = 0;
        
        for(int i=0;i<pushed.length;i++){
            st.push(pushed[i]);
            
            while(!st.isEmpty() && st.peek() == popped[ptr]){
                st.pop();
                ptr++;
            }
        }
        
        if(ptr<popped.length){
            return false;
        }
        
        return true;
    }
}