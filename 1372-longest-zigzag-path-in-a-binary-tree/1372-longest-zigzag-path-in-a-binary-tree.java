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
    int maxPath = 0;
    public int longestZigZag(TreeNode root) {
        return longestZigZagHelper(root, 0, 0);
    }
    
    public int longestZigZagHelper(TreeNode root, int left, int right){
        if(root==null){
            return Math.max(left, right) - 1;
        }
        int leftBestPath = longestZigZagHelper(root.left, right + 1, 0);
        int rightBestPath = longestZigZagHelper(root.right, 0, left + 1);
        return Math.max(leftBestPath, rightBestPath);
    }
}