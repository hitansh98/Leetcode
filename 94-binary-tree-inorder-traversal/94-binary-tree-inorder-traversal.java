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
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> al = new ArrayList<Integer>();
        // inorderHelper(al, root);
        inorderHelper2(al, root);
        return al;
    }
    
    
    
    
    public void inorderHelper2(List<Integer> al, TreeNode root){
        if(root==null) return;
        Stack<TreeNode> st = new Stack<TreeNode>();
        TreeNode visiting = root;
        
        while(visiting !=null || !st.isEmpty()){
            while(visiting!=null){
                st.push(visiting);
                visiting=visiting.left;
            }
            visiting = st.pop();
            al.add(visiting.val);
            visiting = visiting.right;
            // st.push(visiting.right);
            
        }
        
        return;
    }
    
    public void inorderHelper(List<Integer> al, TreeNode root){
        if(root == null){
            return;
        }
        
        inorderHelper(al, root.left);
        al.add(root.val);
        inorderHelper(al, root.right);
    }
}