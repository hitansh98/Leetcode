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
    int res = 0;
    public int sumNumbers(TreeNode root) {
        if(root==null){
            return 0;
        }
        
        helper(root, 0);
        
        return res;
        
    }
    
    public int helper(TreeNode root, int num){
        if(root==null){
            return 0;
        }
        if(root.left==null && root.right==null){
            int temp = num*10;
            res += num*10 + root.val;
            return temp + root.val;
        }
        
        int leftSide = helper(root.left, num*10 + root.val);
        int rightSide = helper(root.right, num*10 + root.val);
        
        // res+= leftSide+rightSide;
        
        return leftSide+rightSide;
    }
}