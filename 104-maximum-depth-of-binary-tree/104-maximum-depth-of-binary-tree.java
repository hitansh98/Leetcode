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
    int max = 1;
    public void maxCalc(TreeNode root, int maxTemp){
        if(root==null){
            return;
        }
        
        if(maxTemp>max){
            max = maxTemp;
        }
        
        maxCalc(root.left, maxTemp+1);
        maxCalc(root.right, maxTemp+1);
    }
    
    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        maxCalc(root, max);
        return max;
    }
}