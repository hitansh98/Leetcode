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
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if(root1== null && root2==null){
            return null;
        }
        
        if(root1==null){
            return root2;
        }
        
        if(root2 == null){
            return root1;
        }
        
        LinkedList<TreeNode> q1 = new LinkedList<>();
        LinkedList<TreeNode> q2 = new LinkedList<>();
        
        
        q1.offer(root1);
        q2.offer(root2);
        
        while(!q1.isEmpty() || !q2.isEmpty()){
            TreeNode curr1 = null;
            TreeNode curr2 = null;
            
            if(!q1.isEmpty()){
                curr1 = q1.poll();    
            }
            
            if(!q2.isEmpty()){
                curr2 = q2.poll();
            }
            
            curr1.val = curr1.val +curr2.val;
            
            if(curr1.left == null && curr2.left!=null) curr1.left = curr2.left;
            else if(curr1.left !=null && curr2.left!=null){
                q1.offer(curr1.left);   
                q2.offer(curr2.left);
            }
            
            if(curr1.right == null && curr2.right!=null) curr1.right = curr2.right;
            else if(curr1.right !=null && curr2.right!=null){
                q1.offer(curr1.right);   
                q2.offer(curr2.right);
            }
            
        }
        
        return root1;
        
        
    }
}