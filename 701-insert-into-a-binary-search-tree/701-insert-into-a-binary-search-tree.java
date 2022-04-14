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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null){
            root = new TreeNode(val);
            return root;
        }
        // helper(root.left, val);
        // helper(root.right, val);
        
        if(root.val > val){
            if(root.left == null){
                root.left = new TreeNode(val);
                return root;
            }
            
            insertIntoBST(root.left, val);
        }
        
         else{
            if(root.right == null){
                root.right = new TreeNode(val);
                return root;
            }
            
            insertIntoBST(root.right, val);
        }
        
        return root;
    }
    
//     public void helper(TreeNode root, int val){
//         if(root==null){
//             root = new TreeNode(val);
//             return;
//         }
        
//         if(root.val > val){
//             if(root.left == null){
                
//             }
//             helper(root.left, val);
//             return;
//         }
        
//         else{
//             helper(root.right, val);
//             return;
//         }
//     }
}