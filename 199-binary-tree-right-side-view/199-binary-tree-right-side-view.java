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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> al = new ArrayList<Integer>();
        RtoLLevelOrder(root, 0, al);
        
        return al;
    }
    
    public void RtoLLevelOrder(TreeNode root, int lvl, List<Integer> al){
        
        if(root==null){
            return;
        }
        
        if(al.size()<=lvl){
            al.add(root.val);
        }
        
        RtoLLevelOrder(root.right, lvl+1, al);
        RtoLLevelOrder(root.left, lvl+1, al);
    }
}