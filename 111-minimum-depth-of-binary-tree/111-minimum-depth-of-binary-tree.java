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
    public int minDepth(TreeNode root) {
        return traverseHelper(root, 0);
    }
    
    public int traverseHelper(TreeNode root, int depth){
        if(root==null) return 0;
        if(root.left==null && root.right==null){
            return depth+1;
        }
        if(root.left == null){
            return traverseHelper(root.right, depth+1);
        }
        else if(root.right == null){
            return traverseHelper(root.left, depth+1);
        }
        return Math.min(traverseHelper(root.left, depth+1),traverseHelper(root.right, depth+1));
    }
}