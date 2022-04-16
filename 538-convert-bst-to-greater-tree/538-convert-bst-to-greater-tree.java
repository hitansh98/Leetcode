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
    public TreeNode convertBST(TreeNode root) {
        if(root == null){
            return null;
        }
        
        BSTHelper(root,0);
        
        return root;
    }
    
    public int BSTHelper(TreeNode root, int sum){
        if(root==null){
            return sum;
        }
        
        int right = BSTHelper(root.right, sum);
        
        
        int left = BSTHelper(root.left, root.val + right);
        
        root.val = root.val + right;
        return left;
    }
}