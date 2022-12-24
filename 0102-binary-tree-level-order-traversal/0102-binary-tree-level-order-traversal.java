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
        if(root==null) return res;
        //recursiveHelper(root, 0, res);
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.offer(root);
        
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> inner = new ArrayList<Integer>();
            for( int i=0;i<size;i++){
                TreeNode curr = q.poll();
                inner.add(curr.val);
                if(curr.left!=null){
                    q.offer(curr.left);
                }
                if(curr.right!=null){
                    q.offer(curr.right);
                }
            }
            res.add(inner);            
        }
        
        return res;
    }
    
    public void recursiveHelper(TreeNode root, int lvl, List<List<Integer>> res){
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
        
        
        recursiveHelper(root.left, lvl+1, res);
        recursiveHelper(root.right, lvl+1, res);
    }
    
}