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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return buildUtil(inorder, preorder, 0, inorder.length-1, 0, inorder.length-1);
    }
    
    public TreeNode buildUtil(int[] inorder, int[] preorder, int pStart, int pEnd, int iStart, int iEnd){
        if(iStart>iEnd){
            return null;
        }
        
        else if(iStart==iEnd){
            return new TreeNode(preorder[pStart]) ;
        }
        
        int index = findValue(inorder, preorder[pStart]);
        // System.out.println(preorder[pStart]+" "+index);
        TreeNode root = new TreeNode(inorder[index]);
        int leftLen = index - iStart;
        int rightLen = iEnd - index;
        root.left = buildUtil(inorder, preorder, pStart+1, pStart+leftLen, iStart, index-1);
        root.right = buildUtil(inorder, preorder, pStart+1+leftLen, pEnd, index+1, iEnd);
        return root;
        
    }
    
    public int findValue(int inorder[], int val){
        for(int i=0;i<inorder.length;i++){
            if(inorder[i]==val){
                return i;
            }
        }
        return -1;
    }
}