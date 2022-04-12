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
    List<List<Integer>> al = new ArrayList<List<Integer>>();
    
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<Integer> t = new ArrayList<Integer>();
        helperFn(root, targetSum, t);
        return al;
    }
    
    public void helperFn(TreeNode root, int target, List<Integer> temp){
        if(root == null){
            return;
        }
        
        temp.add(root.val);
        if(root.val == target && root.left == null && root.right == null){
            al.add(new ArrayList<Integer>(temp));
        }
        else{
            helperFn(root.left, target-root.val, temp);
            helperFn(root.right, target-root.val, temp);
        }
        
        temp.remove(temp.size()-1);
        
    }
}