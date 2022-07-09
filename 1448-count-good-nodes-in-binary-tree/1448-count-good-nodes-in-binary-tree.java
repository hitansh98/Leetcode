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
    public int goodNodes(TreeNode root) {
        return goodNodesHelper(root, Integer.MIN_VALUE);
    }
    
    public int goodNodesHelper(TreeNode root, int max){
        if(root==null){
            return 0;
        }
        
        max = Math.max(max, root.val); 
        int left = goodNodesHelper(root.left, max);
        int right = goodNodesHelper(root.right, max);
        
        if(max <= root.val){
            return 1 + left + right;
        }
        
        return left + right;
    }
}