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
    public List<Double> averageOfLevels(TreeNode root) {
        LinkedList<TreeNode> q = new LinkedList<>();
        q.push(root);
        List<Double> res = new ArrayList<Double>();
        while(!q.isEmpty()){
            int count = q.size();
            double sum = 0;
            
            for(int i=0;i<count;i++){
                TreeNode curr = q.poll();
                sum += curr.val;
                
                if(curr.left!=null) q.offer(curr.left);
                if(curr.right!=null) q.offer(curr.right);
                
                if(i==count-1){
                    double avg = sum/count;
                    res.add(avg);
                }
            }
        }
        
        return res;
    }
}