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
    public int calculateHeight(TreeNode root){
        if(root==null){
            return 0;
        }
        return 1+Math.max(calculateHeight(root.left),calculateHeight(root.right));
    }
    
    public boolean isBalanced(TreeNode root) {
        if(root==null){
            return true;
        }
        return isBalanced(root.left) && isBalanced(root.right) && Math.abs(calculateHeight(root.left)-calculateHeight(root.right))<=1 ;
    }
}