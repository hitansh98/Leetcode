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
    public Node cloneGraph(Node node) {
        Map<Node, Node> hm = new HashMap<>();
        if(node==null) return null;
        //traverse graph via BFS
        Queue<Node> q = new LinkedList<>();
        Set<Node> visited = new HashSet<>();
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
            
            for(Node neighbor: curr.neighbors){
                if(!hm.keySet().contains(neighbor)){
                    hm.put(neighbor, new Node(neighbor.val));
                    
                }
                hm.get(curr).neighbors.add(hm.get(neighbor));
                q.offer(neighbor);
            }
        }
        
        return hm.get(node);
        
    }
}