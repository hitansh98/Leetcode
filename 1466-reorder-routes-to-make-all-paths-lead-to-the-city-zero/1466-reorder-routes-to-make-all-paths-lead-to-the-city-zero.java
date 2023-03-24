class Solution {
    int res;
    public int minReorder(int n, int[][] connections) {
        int res = 0;
        List<Integer>[] undirectedMap = new List[n];
        
        for(int i=0;i<undirectedMap.length;i++){
            undirectedMap[i] = new ArrayList<Integer>();
        }
        
        for(int i=0;i<connections.length;i++){
            int[] curr = connections[i];
            undirectedMap[curr[0]].add(curr[1]);
            undirectedMap[curr[1]].add(-curr[0]);
            
        }
        
        
        
        boolean[] vis = new boolean[n];
        Arrays.fill(vis, false);
        
        
        return dfs(0, undirectedMap, vis);
    }
    
    
    
    public int dfs(int val, List<Integer>[] undirectedMap, boolean[] vis){
        List<Integer> conns = undirectedMap[val];
        vis[val] = true;
        int change = 0;
        
        for(int conn: conns){
            if(!vis[Math.abs(conn)]){
                change += dfs(Math.abs(conn), undirectedMap, vis) + (conn > 0 ? 1 : 0);    
            }
        }
        
        return change;
    }
}