/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class BSTIterator {
    public TreeNode current;
    public Stack<TreeNode> st;
    
    public BSTIterator(TreeNode root) {
        current = root;
        st = new Stack<TreeNode>();
    }
    
    public int next() {
        while(current!=null){
            st.push(current);
            current = current.left;
        }
        
        TreeNode temp = st.pop();
        current = temp.right;
        return temp.val;
    }
    
    public boolean hasNext() {
        return current!=null || !st.isEmpty();
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */