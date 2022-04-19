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
    
    public void recoverTree(TreeNode root) {
        TreeNode prev = null;
        TreeNode pred = null;
        
        TreeNode first = null;
        TreeNode second = null;
        
        TreeNode curr = root;
        
        while(curr!=null){
            
            if(prev!=null && prev.val >= curr.val){
                if(first == null) first = prev;
                second = curr;
            }
            
            if(curr.left!=null){
                pred = curr.left;
                
                while(pred.right!=null && pred.right!=curr){
                    pred = pred.right;
                }
                
                if(pred.right == curr){
                    pred.right=null;
                    prev = curr;
                    curr = curr.right;
                }
                else{
                    pred.right = curr;
                    curr = curr.left;
                }
            }
            else{
                //continue with right subtree
                prev = curr;
                curr = curr.right;
            }
        }
        
        int temp = first.val;
        first.val = second.val;
        second.val = temp;
    }
    
//     public void inorderHelper(TreeNode root){
//         if(root==null){
//             return;
//         }
        
//         inorderHelper(root.left);
        
//         if(prev!=null && prev.val >= root.val){
//             if(first == null) first = prev;
//             second = root;
//         }
        
//         prev = root;
        
//         inorderHelper(root.right);
//     }
}