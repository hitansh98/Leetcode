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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        
        List<Integer> al = new ArrayList<Integer>();
        helper(root, res, al, targetSum);
        
        return res;
    }
    
    public void helper(TreeNode root, List<List<Integer>> res, List<Integer> al, int targetSum){
        if(root==null){
            return;
        }
        List<Integer> al2 = new ArrayList<Integer>(al);
        al2.add(root.val);
        if(root.left==null && root.right==null && targetSum-root.val==0){
            res.add(al2);
        }
        
        helper(root.left, res, al2, targetSum-root.val);
        helper(root.right, res, al2, targetSum-root.val);
    }
}