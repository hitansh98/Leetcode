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
    public int sumNumbers(TreeNode root) {
        if(root==null) return 0;
        return sumHelper(root, 0);
    }
    
    public int sumHelper(TreeNode root, int sum){
        if(root==null) return 0;
        
        if(root.left==null && root.right==null){
            System.out.println(sum+" "+root.val);
            return sum+root.val;
        }
        
        return sumHelper(root.left, 10*(sum+root.val)) + sumHelper(root.right, 10*(sum+root.val));
    }
}