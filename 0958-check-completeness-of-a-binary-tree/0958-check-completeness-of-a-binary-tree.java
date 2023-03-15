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
    public boolean isCompleteTree(TreeNode root) {
        if(root==null) return true;
        
        LinkedList<TreeNode> q = new LinkedList<>();
        boolean end = false;
        q.push(root);
        while(!q.isEmpty()){
            TreeNode curr = q.poll();
            if(curr == null){
                end = true;
            }
            else{
                if(end) return false;
                q.offer(curr.left);
                q.offer(curr.right);
            }
        }
        
        return true;
        
    }
}