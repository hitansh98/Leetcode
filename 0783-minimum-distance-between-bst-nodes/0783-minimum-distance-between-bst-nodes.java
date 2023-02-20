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
    int minVal = Integer.MAX_VALUE;
    TreeNode prev = null;
    
    
    public int minDiffInBST(TreeNode root) {
        if(root.left!=null){
            minDiffInBST(root.left);
        }
        
        if(prev!=null){
            minVal = Math.min(minVal, root.val-prev.val);  
        } 
        
        prev = root;
        
        if(root.right!=null){
            minDiffInBST(root.right);
        }
        
        return minVal;
    }
}