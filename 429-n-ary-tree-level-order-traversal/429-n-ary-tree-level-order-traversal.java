/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> result = new ArrayList<>();
        
        if(root==null) return result;
        
        Queue<Node> queue  = new LinkedList<>();
        
        queue.offer(root);
        
        while(queue.size()!=0){
            int length = queue.size();
            ArrayList<Integer> currentLevel = new ArrayList<Integer>();
            for(int i=0;i<length;i++){
                Node n = queue.poll();
                currentLevel.add(n.val);
                for(Node node: n.children){
                    queue.offer(node);
                }
            }
            result.add(currentLevel);
        }
        
        return result;
    }
}