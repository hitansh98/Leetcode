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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        helper(root, 0, res);
        
        return res;
    }
    
    public void helper(TreeNode root, int lvl, List<List<Integer>> res){
        if(root==null){
            return;
        }
        if(res.size()<=lvl){
            List<Integer> al = new ArrayList<Integer>();
            res.add(al);
        }
        
        List<Integer> temp = res.get(lvl);
        temp.add(root.val);
        res.set(lvl, temp);
        
        
        helper(root.left, lvl+1, res);
        helper(root.right, lvl+1, res);
    }
    
}