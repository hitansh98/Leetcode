class Solution {
    public int findCenter(int[][] edges) {
//         int numEdges = edges.length;
//         int[] nodeEdgeCount = new int[numEdges + 2];
        
//         for(int[] edge: edges) {
//             nodeEdgeCount[edge[0]]++;
//             nodeEdgeCount[edge[1]]++;
//         }
        
//         for(int i=0;i<nodeEdgeCount.length;i++) {
//             if(nodeEdgeCount[i] == numEdges) {
//                 return i;
//             }
//         }
        
//         return -1;
        
        Set<Integer> hs = new HashSet<>();
        
        for(int edge: edges[0]) {
            hs.add(edge);
        }
        
        for(int edge: edges[1]) {
            if(hs.contains(edge)) {
                return edge;
            }
            hs.add(edge);
        }
        
        return -1;
        
    }
}