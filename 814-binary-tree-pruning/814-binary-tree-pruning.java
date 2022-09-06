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
    public TreeNode pruneTree(TreeNode root) {
        if(root==null) return root;
        
        root.left = pruneTree(root.left);
        root.right = pruneTree(root.right);
        
        if(root.val == 1 || pruneTree(root.left)!=null || pruneTree(root.right)!=null){
            return root;
        }
        
        return null;
    }
}