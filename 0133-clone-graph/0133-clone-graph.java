/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    Map<Node, Node> hm;
    public Node cloneGraph(Node node) {
        if(node==null) return null;
        hm = new HashMap<>();
        Set<Node> visited = new HashSet<>();
        LinkedList<Node> q = new LinkedList<>();
        
        q.offer(node);
        
        while(!q.isEmpty()){
            Node curr = q.poll();
            
            if(visited.contains(curr)){
                continue;
            }
            
            visited.add(curr);
            
            if(!hm.keySet().contains(curr)){
                hm.put(curr, new Node(curr.val));
            }
            
            for(Node nei: curr.neighbors){
                if(!hm.keySet().contains(nei)){
                    hm.put(nei, new Node(nei.val));
                }
                
                hm.get(curr).neighbors.add(hm.get(nei));
                q.offer(nei);
            }
        }
        
        return hm.get(node);
    }
    
    
}