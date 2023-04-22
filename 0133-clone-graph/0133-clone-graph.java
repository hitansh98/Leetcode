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
    Set<Node> visited;
    public Node cloneGraph(Node node) {
        if(node==null) return null;
        hm = new HashMap<>();
        visited = new HashSet<>();
        
        
        //BFS solution
        // LinkedList<Node> q = new LinkedList<>();
        
        // q.offer(node);
        
//         while(!q.isEmpty()){
//             Node curr = q.poll();
            
//             if(visited.contains(curr)){
//                 continue;
//             }
            
//             visited.add(curr);
            
//             if(!hm.keySet().contains(curr)){
//                 hm.put(curr, new Node(curr.val));
//             }
            
//             for(Node nei: curr.neighbors){
//                 if(!hm.keySet().contains(nei)){
//                     hm.put(nei, new Node(nei.val));
//                 }
                
//                 hm.get(curr).neighbors.add(hm.get(nei));
//                 q.offer(nei);
//             }
//         }
        
        //DFS Solution
        
        dfs(node);
        
        return hm.get(node);
    }
    
    public void dfs(Node node){
        if(visited.contains(node)){
            return;
        }
        
        visited.add(node);
        
        if(!hm.keySet().contains(node)){
            hm.put(node, new Node(node.val));
        }
        
        for(Node nei: node.neighbors){
            if(!hm.keySet().contains(nei)){
                hm.put(nei, new Node(nei.val));
            }
            
            hm.get(node).neighbors.add(hm.get(nei));
            dfs(nei);
        }
    }
    
}