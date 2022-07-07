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
    
    List<List<Integer>> al;
    public List<List<Integer>> levelOrder(TreeNode root) {
        al = new ArrayList<List<Integer>>();
        if(root==null){
            return al;
        }
        levelTraversal(root, 0);
        
        return al;
    }
    
    public void levelTraversal( TreeNode root, int lvl){
        if(root==null){
            return;
        }
        if(al.size()<=lvl){
            List<Integer> inner = new ArrayList<Integer>();
            al.add(lvl, inner);
        }
        al.get(lvl).add(root.val);
        
        levelTraversal(root.left, lvl+1);
        levelTraversal(root.right, lvl+1);
    }
}