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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> al = new ArrayList<List<Integer>>();
        // helper(root, al, 0);
        // Collections.reverse(al);
        
        if(root==null){
            return al;
        }
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        
        q.offer(root);
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> temp = new ArrayList<Integer>();
            while(size-- > 0){
                TreeNode curr = q.poll();
                temp.add(curr.val);
                if(curr.left!=null) q.offer(curr.left);
                if(curr.right!=null) q.offer(curr.right);
            }
            
            al.add(0, temp);
        }
        
        return al;
    }
    
    
    public void helper(TreeNode root, List<List<Integer>> al, int lvl){
        if(root==null){
            return;
        }
        
        if(lvl==al.size()){
            al.add(new ArrayList<Integer>());
        }
        
        
        List<Integer> temp = al.get(lvl);
        temp.add(root.val);
        al.set(lvl, temp);
        
        helper(root.left, al, lvl+1);
        helper(root.right, al, lvl+1);
        
        return;
    }
}