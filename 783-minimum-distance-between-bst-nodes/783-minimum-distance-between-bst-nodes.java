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
    public int min = Integer.MAX_VALUE;
    public int minDiffInBST(TreeNode root) {
        
        
        if(root.left!=null){
            min = Math.min(min, Math.abs(root.val-root.left.val));
            if(root.left.val != rightmostSub(root.left)) min = Math.min(min, Math.abs(root.val - rightmostSub(root.left)));
            System.out.println("Updated min in LS: "+min+" Values being: "+root.left.val+ " "+rightmostSub(root.left));
            minDiffInBST(root.left);
            
        }
        
        if(root.right!=null){
            min = Math.min(min, Math.abs(root.val-root.right.val));
            if(root.right.val != leftmostSub(root.right)) min = Math.min(min, Math.abs(root.val - leftmostSub(root.right)));
            System.out.println("Updated min in RS: "+min+" Values being: "+root.right.val+ " "+leftmostSub(root.right));
            minDiffInBST(root.right);
        }
        
        return min;
    }
    
    public int rightmostSub(TreeNode root){
        while(root.right != null){
            root = root.right;
        }
        
        return root.val;
    }
    
    public int leftmostSub(TreeNode root){
        while(root.left != null){
            root = root.left;
        }
        
        return root.val;
    }
}