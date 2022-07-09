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
        
        int curr = goodNodesHelper(root.left, max) + goodNodesHelper(root.right, max);
        if(root.val >= max){
            return 1 + curr;
        }
        return curr;
    }
}