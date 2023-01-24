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
    public void flatten(TreeNode root) {
        this.flattenTree(root);
    }
//         while(root!=null){
//             if(root.left!=null){
//                 TreeNode pre = root.left;
                
//                 while(pre.right!=null){
//                     pre = pre.right;
//                 }
                
//                 pre.right = root.right;
//                 root.right = root.left;
//                 root.left = null;
//             }
//             root = root.right;
//         }
    
    public TreeNode flattenTree(TreeNode root){
        
        if(root==null || (root.left==null && root.right==null)){
            return root;
        }
        
        TreeNode leftTail = flattenTree(root.left);
        TreeNode rightTail = flattenTree(root.right);
        
        if(leftTail!=null){
            leftTail.right = root.right;
            root.right = root.left;
            root.left = null;
        }
        
        if(rightTail!=null) return rightTail;
        
        return leftTail;
        
    }
}