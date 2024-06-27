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
    public TreeNode bstToGst(TreeNode root) {
        List<TreeNode> list = new ArrayList<>();
        traverseTree(root, list);
        
        for(int i=list.size()-2; i>=0; i--) {
            TreeNode current = list.get(i);
            current.val += list.get(i+1).val;
        }
        
        return root;
    }
    
    public void traverseTree(TreeNode root, List<TreeNode> list) {
        if(root == null) {
            return;
        }
        
        traverseTree(root.left, list);
        list.add(root);
        traverseTree(root.right, list);
    }
}