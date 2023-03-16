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
    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        if(preorder.length==0){
            return null;
        }
        
        return buildHelper(preorder, postorder, 0, preorder.length-1, 0, postorder.length-1);
    }
    
    public TreeNode buildHelper(int[] preorder, int[] postorder, int pre_st, int pre_end, int post_st, int post_end){
        if(pre_st > pre_end || post_st > post_end){
            return null;
        }
        
        if(pre_st == pre_end){
            return new TreeNode(preorder[pre_st]);
        }
        
        TreeNode root = new TreeNode(preorder[pre_st]);
        
        int searchIndex = nodeIndex(postorder, preorder[pre_st + 1]);
        int leftLen = searchIndex - post_st + 1;
        int rightLen = post_end - 1 - searchIndex;
        
        root.left = buildHelper(preorder, postorder, pre_st + 1, pre_st + leftLen, post_st, post_st + leftLen -1);
        root.right = buildHelper(preorder, postorder, pre_st + leftLen + 1, pre_end, searchIndex + 1, post_end - 1 );
        
        return root;
    }
    
    public int nodeIndex(int[] postorder, int val){
        int idx = -1;
        for(int i=0;i<postorder.length;i++){
            if(postorder[i] == val){
                idx = i;
            }
        }
        
        return idx;
    }
}