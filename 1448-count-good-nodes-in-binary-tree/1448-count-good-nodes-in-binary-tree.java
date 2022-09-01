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
        int count = traverseHelper(root, Integer.MIN_VALUE);
        return count;
    }
    
    public int traverseHelper(TreeNode root, int max){
        if(root==null){
            return 0;
        }
        if(root.val>=max){
            max = root.val;
            return 1+traverseHelper(root.left, max)+traverseHelper(root.right, max);
        }
        return traverseHelper(root.left, max)+traverseHelper(root.right, max);
    }

}