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
    int count = 0;
    public int goodNodes(TreeNode root) {
        int maxTillNow = root.val;
        helper(root, maxTillNow);
        return count;
    }
    
    
    public void helper(TreeNode root, int maxTillNow){
        if(root==null) return;
        
        
        if(root.val>=maxTillNow) count++;
        
        maxTillNow = Math.max(root.val, maxTillNow);
        helper(root.left, maxTillNow);
        helper(root.right, maxTillNow);
    }
}