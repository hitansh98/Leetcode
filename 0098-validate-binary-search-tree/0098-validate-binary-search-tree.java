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
    public boolean isValidBST(TreeNode root) {
        return helper(root, null, null);
    }
    
    
    public boolean helper(TreeNode root, TreeNode min, TreeNode max){
        if(root==null) return true;
        
        if((min != null &&  min.val >= root.val) || (max != null && max.val <= root.val)){
            return false;
        }
        
        return helper(root.left, min, root) && helper(root.right, root, max);
    }
}