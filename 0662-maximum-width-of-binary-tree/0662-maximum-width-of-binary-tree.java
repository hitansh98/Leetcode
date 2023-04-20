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

class Pair{
    TreeNode node;
    int position;
    
    public Pair(TreeNode node, int position){
        this.node = node;
        this.position = position;
    }
}

class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        int maxWidth = 0;
        Queue<Pair> q = new LinkedList<Pair>();
        
        q.offer(new Pair(root, 1));
        while(!q.isEmpty()){
            int size = q.size();
            int count = 0;
            int startIndex = 0;
            int endIndex = 0;
            // System.out.println(q);
            for(int i=0;i<size;i++){
                Pair curr = q.poll();
                
                
                if(i==0){ //first index
                    startIndex = curr.position;
                }
                
                if(i==size-1){ //last index
                    endIndex = curr.position;
                }
                
                if(curr.node.left!=null){
                    q.offer(new Pair(curr.node.left, curr.position*2));
                }
                
                if(curr.node.right!=null){
                    q.offer(new Pair(curr.node.right, curr.position*2 + 1));
                }
            }
            
            maxWidth = Math.max(maxWidth, endIndex - startIndex + 1);
        }
        
        return maxWidth;
    }
    
    
    public int maxDepth(TreeNode root){
        if(root==null) return 0;
        
        return 1 + Math.max(maxDepth(root.left) , maxDepth(root.right));
    }
}