class Solution {
    public int[] shortestAlternatingPaths(int n, int[][] redEdges, int[][] blueEdges) {
        List<Integer>[] reds = new ArrayList[n];
        List<Integer>[] blues = new ArrayList[n];
        
        for(int[] redEdge: redEdges){
            if(reds[redEdge[0]]==null){
                reds[redEdge[0]] = new ArrayList<Integer>();
            }
            
            reds[redEdge[0]].add(redEdge[1]);
        }
        
        for(int[] blueEdge: blueEdges){
            if(blues[blueEdge[0]]==null){
                blues[blueEdge[0]] = new ArrayList<Integer>();
            }
            
            blues[blueEdge[0]].add(blueEdge[1]);
        }
        
        
        int[] res = new int[n];
        Arrays.fill(res, -1);
        
        Set<String> seen = new HashSet<String>();
        
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{0,0}); //array element containing current node, previous color code. 0=neutral, 1=red, 2=blue
        
        
        int moves = 0;
        
        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0;i<size;i++){
                int[] curr = q.poll();
                String key = curr[0]+" "+curr[1]; 
                if(seen.contains(key)){
                   continue; 
                }
                
                seen.add(key);
                
                if(res[curr[0]]==-1){
                    res[curr[0]] = moves;                
                }
                
                if(curr[1]==1 || curr[1]==0){
                    if(blues[curr[0]]!=null){
                        for(int node: blues[curr[0]]){
                            q.add(new int[]{node, 2});
                        }
                    }
                }
                
                if(curr[1]==2 || curr[1]==0){
                    if(reds[curr[0]]!=null){
                        for(int node: reds[curr[0]]){
                            q.add(new int[]{node, 1});
                        }
                    }
                }
                
            }
            
            ++moves;
        
        }
        
        return res;
    }
}