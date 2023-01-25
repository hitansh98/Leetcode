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
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        Map<Integer, Map<Integer, List<Integer>>> mapping = new TreeMap<>(); //outer mapping for hz distance. inner mapping for lvls
        this.buildMapping(root, 0, 0, mapping);
        // System.out.println(mapping);
        // System.out.println(mapping.keySet());
        
        List<List<Integer>> res = new ArrayList<>();
        
        for(int i: mapping.keySet()){
            Map<Integer, List<Integer>> hm = mapping.get(i);
            List<Integer> distWiseList = new ArrayList<Integer>();
            for(int j: hm.keySet()){
                List<Integer> temp = hm.get(j);
                if(temp.size()>1){
                    Collections.sort(temp);
                }
                for(int ele: temp){
                    distWiseList.add(ele);
                }
            }
            res.add(distWiseList);
        }
        
        
        return res;
        
        
    }
    
    
    public void buildMapping(TreeNode root, int lvl, int dist, Map<Integer, Map<Integer, List<Integer>>> mapping){
        if(root==null) return;
        
        Map<Integer, List<Integer>> hm = mapping.getOrDefault(dist, new TreeMap<Integer, List<Integer>>());
        
        List<Integer> innerList = hm.getOrDefault(lvl, new ArrayList<Integer>());
        
        innerList.add(root.val);
        hm.put(lvl, innerList);
        mapping.put(dist, hm);
        
        buildMapping(root.left, lvl+1, dist-1, mapping);
        buildMapping(root.right, lvl+1, dist+1, mapping);
    }
}