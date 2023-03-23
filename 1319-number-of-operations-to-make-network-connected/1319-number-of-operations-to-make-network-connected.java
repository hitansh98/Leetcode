// class Solution {
//     public int makeConnected(int n, int[][] connections) {
//         //build the adjacency list
//         if(connections.length < n-1){
//             return -1;
//         }
        
//         List<Integer>[] adj = new List[n];
//         for (int i = 0; i < n; i++) adj[i] = new ArrayList<>();
        
        
//         for(int i=0;i<connections.length;i++){
//             int[] curr = connections[i];
            
//             adj[curr[0]].add(curr[1]);
//             adj[curr[1]].add(curr[0]);
         
//         }
        
    
        
//         boolean[] vis = new boolean[n];
//         Arrays.fill(vis, false);
        
//         int connectedComps = 0;
        
        
        
//         for(int i=0;i<vis.length;i++){
//             if(vis[i]==false){
                
//                 LinkedList<Integer> q = new LinkedList<>();
//                 q.offer(i);
//                 // System.out.println(i);
//                 while(!q.isEmpty()){
//                     // System.out.println(q);
//                     int currNode = q.poll();
                    
//                     List<Integer> ls = adj[currNode];
//                     for(int conn: ls){
//                         if(!vis[conn]){
//                             q.offer(conn);   
//                         }
//                     }
//                     vis[currNode] = true;
//                 }
//                 connectedComps++;
//             }
            
//         }
        
//         return connectedComps-1;
        
//     }
// }


class Solution {
    public int makeConnected(int n, int[][] connections) {
        if (connections.length < n - 1) return -1; // To connect all nodes need at least n-1 edges
        List<Integer>[] graph = new List[n];
        for (int i = 0; i < n; i++) graph[i] = new ArrayList<>();
        for (int[] c : connections) {
            graph[c[0]].add(c[1]);
            graph[c[1]].add(c[0]);
        }
        int components = 0;
        boolean[] visited = new boolean[n];
        for (int v = 0; v < n; v++) components += bfs(v, graph, visited);
        return components - 1; // Need (components-1) cables to connect components together
    }
    int bfs(int src, List<Integer>[] graph, boolean[] visited) {
        if (visited[src]) return 0;
        visited[src] = true;
        Queue<Integer> q = new LinkedList<>();
        q.offer(src);
        while (!q.isEmpty()) {
            int u = q.poll();
            for (int v : graph[u]) {
                if (!visited[v]) {
                    visited[v] = true;
                    q.offer(v);
                }
            }
        }
        return 1;
    }
}