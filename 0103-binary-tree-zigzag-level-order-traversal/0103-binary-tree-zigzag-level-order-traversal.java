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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root==null) return res;
        Deque<TreeNode> q = new LinkedList<TreeNode>();
        q.offerFirst(root);
        int lvl = 0;
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> temp = new ArrayList<Integer>();
            for(int i=0;i<size;i++){
                // System.out.println(q);
                TreeNode curr;
                if(lvl%2!=0){
                    curr = q.removeFirst();
                    temp.add(curr.val);
                    if(curr.right!=null){
                        q.offerLast(curr.right);
                    }
                    if(curr.left!=null){
                        q.offerLast(curr.left);
                    }
                }
                else{
                    curr = q.removeLast();
                    temp.add(curr.val);
                    if(curr.left!=null){
                        q.offerFirst(curr.left);
                    }
                    if(curr.right!=null){
                        q.offerFirst(curr.right);
                    }
                }
                
                // temp.add(curr.val);
                
                
            }
            lvl++;
            res.add(temp);
        }

        return res;
    }
}