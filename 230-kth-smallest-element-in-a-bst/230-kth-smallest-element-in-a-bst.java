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
    public int ans;
    public int count = 0;
    public int kthSmallest(TreeNode root, int k) {
        if(root==null){
            return 0;
        }
        
        kthSmallest(root.left, k);
        // System.out.println("Value of c 1: "+count);
        count++;
        // System.out.println("Value of c 2: "+count);
        if(count==k){
            ans = root.val;
        }
        
        kthSmallest(root.right, k);
        
        return ans;
    }
    
   
}