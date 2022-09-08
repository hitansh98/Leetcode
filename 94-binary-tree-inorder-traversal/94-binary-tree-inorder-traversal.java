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
        inorderHelper(al, root);
        return al;
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