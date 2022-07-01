class MinStack {
    Stack<Integer> st;
    Stack<Integer> minStack;
    
    public MinStack() {
        st = new Stack<Integer>();
        minStack = new Stack<Integer>();
    }
    
    public void push(int val) {
        st.push(val);
        
        if(minStack.size()==0 || minStack.peek()>=val){
            minStack.push(val);
        }
    }
    
    public void pop() {
        // System.out.println(minStack.peek().getClass().getSimpleName());
        // System.out.println(minStack.peek() == st.peek());
        if(minStack.peek().equals(st.peek())){
            minStack.pop();
        }
        st.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        if(minStack.size()>0){
            return minStack.peek();
        }
        return 0;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */