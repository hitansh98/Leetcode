class StockSpanner {
    Stack<int[]> st;
    Stack<Integer> st2;
    int res;
    public StockSpanner() {
        st = new Stack<int[]>();
    }
    
    public int next(int price) {
        res = 1;
        
        while(!st.isEmpty() && st.peek()[0] <= price){
            res += st.pop()[1];
        }
        
        st.push(new int[]{price, res});
        
        return res;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */