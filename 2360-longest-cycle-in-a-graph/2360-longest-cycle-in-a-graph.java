class Solution {
    int maxCycle;
    public int longestCycle(int[] edges) {
        maxCycle = -1;
        boolean[] vis = new boolean[edges.length];
        int[] pathVis = new int[edges.length];
        
        for(int i=0;i<vis.length;i++){
            if(!vis[i] && edges[i]!= -1){
                dfs(i, edges, vis, pathVis, 1);
            }
        }
        
        return maxCycle;
    }
    
    public void dfs(int i, int[] edges, boolean[] vis, int[] pathVis, int num){
        if(vis[i]){
            if(pathVis[i]!=0){
                maxCycle = Math.max(num - pathVis[i], maxCycle);
                return;
            }
            else{
                return;
            }
        }
        vis[i] = true;
        pathVis[i] = num;
        
        if(edges[i]!=-1){
            dfs(edges[i], edges, vis, pathVis, num+1);    
        }
        
        pathVis[i] = 0;
    }
}