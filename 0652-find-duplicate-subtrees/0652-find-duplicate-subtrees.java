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
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        List<TreeNode> al = new ArrayList<TreeNode>();
        Map<String, Integer> hm = new HashMap<>();
        helper(root, al, hm);
        
        return al;
    }
    
    public String helper(TreeNode root, List<TreeNode> al, Map<String, Integer> hm){
        if(root==null){
            return "";
        }
        
        String left = helper(root.left, al, hm);
        String right = helper(root.right, al, hm);
        
        String currStr = root.val+"-"+left+"-"+right;
        
        hm.put(currStr, hm.getOrDefault(currStr, 0)+1);
        
        if(hm.get(currStr) == 2){
            al.add(root);
        }
        
        return currStr;
    }
}