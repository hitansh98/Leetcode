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
    Integer[][] dp;
    // LinkedList<TreeNode> q1;
    
    public int rob(TreeNode root) {
        if(root==null) return 0;
        
        // int h = calcHeight(root);
        // // int num = calcNodes(root);
        // int num = 0;
        // for(int i=0;i<h;i++){
        //     num += Math.pow(2, i);
        // }
        // System.out.println(h+" "+num);
        // dp = new Integer[num+1][2];
        
        
        return helper(root, new HashMap<>());
    }
    
    
    
    public int helper(TreeNode root, Map<TreeNode, Integer> map){
        if(root == null){
            return 0;
        }
        
        if(map.containsKey(root)){
            return map.get(root);
        }
        
        // if(canRob == 1){
        //     map.set(root, Math.max(helper(root.left, map) + helper(root.right, map), root.val + helper(root.left, map) + helper(root.right, map)));
        // }
        // else{
        //     map.set(root, helper(root.left, map) + helper(root.right, map));
        // }
        int sum = 0;
        if(root.left!=null){
            sum += helper(root.left.left, map) + helper(root.left.right, map);
        }
        
        if(root.right!=null){
            sum += helper(root.right.left, map) + helper(root.right.right, map);
        }
        
        map.put(root, Math.max(root.val + sum, helper(root.left, map) + helper(root.right, map)));
        
        return map.get(root);
        
    }
    
    public int calcHeight(TreeNode root){
        if(root==null){
            return 0;
        }
        
        return 1 + Math.max(calcHeight(root.left), calcHeight(root.right));
    }
}