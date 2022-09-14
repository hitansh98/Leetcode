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
    public int pseudoPalindromicPaths (TreeNode root) {
        
        int[] resultCounter = new int[1];
        resultCounter[0] = 0;
        
        HashSet<Integer> hs = new HashSet<Integer>();
        
        //recursive call (DFS)
        pseudoPalindromicPaths(root, hs, resultCounter);
        
        //return
        return resultCounter[0];
    }
    
    
    public void pseudoPalindromicPaths(TreeNode root, HashSet<Integer> hs, int[] result){
        
        //adding or removing val to HashSet
        boolean isAddedToHashSet = true;
        if(hs.contains(root.val)){
            hs.remove(root.val);
            isAddedToHashSet = false;
        }else{
            hs.add(root.val);
            isAddedToHashSet = true;
        }
        
        
        //check if leafNode
        if(root.left == null && root.right == null){
            //If Psuedo Palindrom, increment result counter
            if(hs.size() == 0 || hs.size() == 1) {
                result[0]++;
            }
        }
        
        //not a leaf node
        //recursive call on left and right child
        if(root.left != null) pseudoPalindromicPaths(root.left, hs, result);
        if(root.right != null) pseudoPalindromicPaths(root.right, hs, result);
        
        //remove or add to the hashset
        if(isAddedToHashSet) hs.remove(root.val);
        else hs.add(root.val);
        
        
    }
}