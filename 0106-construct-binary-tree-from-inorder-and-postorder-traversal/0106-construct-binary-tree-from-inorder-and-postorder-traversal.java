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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(inorder.length==0){
            return null;
        }
        
        return buildHelper(inorder, postorder, 0, inorder.length-1, 0, postorder.length-1);
    }
    
    
    public TreeNode buildHelper(int[] inorder, int[] postorder, int in_st, int in_end, int po_st, int po_end){
        if(in_st > in_end || po_st > po_end){
            return null;
        }
        
        else if(in_st == in_end){
            return new TreeNode(inorder[in_st]);
        }
        
        int nodeIndex = searchNode(inorder, postorder[po_end]);
        // System.out.println(nodeIndex+" "+inorder[nodeIndex]);
        
        TreeNode root = new TreeNode(inorder[nodeIndex]);
        
        int leftLen = nodeIndex - in_st;
        int rightLen = in_end - nodeIndex - 1;
        
        root.left = buildHelper(inorder, postorder, in_st, nodeIndex-1, po_st, po_st + leftLen -1);
        root.right = buildHelper(inorder, postorder, nodeIndex+1, in_end, po_st + leftLen, po_end-1);
        
        return root;
        
    }
    
    public int searchNode(int[] inorder, int val){
        int idx = -1;
        
        for(int i=0;i<inorder.length;i++){
            if(inorder[i] == val){
                idx = i;
            }
        }
        
        return idx;
    }
}