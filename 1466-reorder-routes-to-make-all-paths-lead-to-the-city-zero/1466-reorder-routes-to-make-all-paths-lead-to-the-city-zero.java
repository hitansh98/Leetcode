class Solution {
    int res;
    public int minReorder(int n, int[][] connections) {
        int res = 0;
        List<Integer>[] undirectedMap = new List[n];
        List<Integer>[] directedMap = new List[n];
        for(int i=0;i<undirectedMap.length;i++){
            undirectedMap[i] = new ArrayList<Integer>();
            directedMap[i] = new ArrayList<Integer>();
        }
        
        for(int i=0;i<connections.length;i++){
            int[] curr = connections[i];
            undirectedMap[curr[0]].add(curr[1]);
            undirectedMap[curr[1]].add(curr[0]);
            directedMap[curr[0]].add(curr[1]);
        }
        
        
        boolean[] vis = new boolean[n];
        Arrays.fill(vis, false);
        
        
        return dfs(0, undirectedMap, directedMap, vis);
    }
    
    
    
    public int dfs(int val, List<Integer>[] undirectedMap, List<Integer>[] directedMap, boolean[] vis){
        List<Integer> conns = undirectedMap[val];
        List<Integer> directedConns = directedMap[val];
        
        // System.out.println(conns);
        // System.out.println(directedConns);
        int changes = 0;
        vis[val] = true;
        
        for(int conn: conns){
            if(!vis[conn]){
                changes += dfs(conn, undirectedMap, directedMap, vis) + (directedMap[val].contains(conn) ? 1 : 0);
            }
        }
        
        return changes;
    }
}