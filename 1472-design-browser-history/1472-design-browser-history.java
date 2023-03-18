class DoubleEndedQueue{
    String val;
    DoubleEndedQueue left;
    DoubleEndedQueue right;
    
    public DoubleEndedQueue(String val, DoubleEndedQueue left, DoubleEndedQueue right){
        this.val = val;
        this.left = left;
        this.right = right;
    }
    
    public DoubleEndedQueue(String val){
        this.val = val;
        this.left = null;
        this.right = null;
    }
    
}

class BrowserHistory {
    DoubleEndedQueue dqHead;
    DoubleEndedQueue curr;

    public BrowserHistory(String homepage) {
        this.dqHead = new DoubleEndedQueue(homepage);
        this.curr = this.dqHead;
    }
    
    public void visit(String url) {
        DoubleEndedQueue toVisit =  new DoubleEndedQueue(url);
        this.curr.right = toVisit;
        toVisit.left = this.curr; 
        this.curr = this.curr.right;
    }
    
    public String back(int steps) {
        while(this.curr.left!=null && steps-->0){
            this.curr = this.curr.left;
        }
        
        return this.curr.val;
    }
    
    public String forward(int steps) {
        
        while(this.curr.right!=null && steps-->0){
            this.curr = this.curr.right;
        }
        
        return this.curr.val;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */