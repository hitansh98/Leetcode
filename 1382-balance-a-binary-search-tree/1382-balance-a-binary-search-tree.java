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
    public TreeNode balanceBST(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        traverseTree(root, list);
        
        int num = list.size();
        return constructTree(list, 0, num-1);
    }
    
    public void traverseTree(TreeNode root, List<Integer> list) {
        if(root==null) {
            return;
        }
        
        traverseTree(root.left, list);
        list.add(root.val);
        traverseTree(root.right, list);
        
        return;
    }
    
    public TreeNode constructTree(List<Integer> list, int startIdx, int endIdx) {
        if(startIdx > endIdx) {
            return null;
        }
        int midIdx = startIdx + (endIdx - startIdx)/2;
        TreeNode root = new TreeNode(list.get(midIdx));
        root.left = constructTree(list, startIdx, midIdx - 1);
        root.right = constructTree(list, midIdx + 1, endIdx);
        
        return root;
    }
}