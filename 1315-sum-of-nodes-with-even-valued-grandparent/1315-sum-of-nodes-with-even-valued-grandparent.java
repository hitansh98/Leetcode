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


public class TreeNodeFull{
    TreeNode node;
    boolean isGoodChild;
    boolean isGoodGrandchild;
    
    TreeNodeFull(TreeNode node, boolean isGoodChild, boolean isGoodGrandchild){
        this.node = node;
        this.isGoodChild = isGoodChild;
        this.isGoodGrandchild = isGoodGrandchild;
    }
    
    TreeNodeFull(TreeNode node){
        this.node = node;
        this.isGoodChild = false;
        this.isGoodGrandchild = false;
    }
    
    TreeNodeFull(int val){
        this.node = new TreeNode(val);
        this.isGoodChild = false;
        this.isGoodGrandchild = false;
    }
}


class Solution {
    public int sumEvenGrandparent(TreeNode root) {
        int resSum = 0;
        LinkedList<TreeNodeFull> q = new LinkedList<>();
        q.offer(new TreeNodeFull(root));
        
        while(!q.isEmpty()){
            int size = q.size();
            
            for(int i=0;i<size;i++){
                TreeNodeFull curr = q.poll();
                
                if(curr.isGoodGrandchild == true){
                    resSum += curr.node.val;
                }
                
                if(curr.node.left != null){
                    if(curr.isGoodChild){
                        if(curr.node.val % 2 == 0){
                            q.offer(new TreeNodeFull(curr.node.left, true, true));
                        }
                        else{
                            q.offer(new TreeNodeFull(curr.node.left, false, true));
                        }
                    }
                    else{
                        if(curr.node.val % 2 == 0){
                            q.offer(new TreeNodeFull(curr.node.left, true, false));
                        }
                        else{
                            q.offer(new TreeNodeFull(curr.node.left, false, false));
                        }
                    }
                }
                
                if(curr.node.right != null){
                    if(curr.isGoodChild){
                        if(curr.node.val % 2 == 0){
                            q.offer(new TreeNodeFull(curr.node.right, true, true));
                        }
                        else{
                            q.offer(new TreeNodeFull(curr.node.right, false, true));
                        }
                    }
                    else{
                        if(curr.node.val % 2 == 0){
                            q.offer(new TreeNodeFull(curr.node.right, true, false));
                        }
                        else{
                            q.offer(new TreeNodeFull(curr.node.right, false, false));
                        }
                    }
                }
                
            }
            
        }
        
        return resSum;
    }
}