class Solution {
    public int findCenter(int[][] edges) {
        int numEdges = edges.length;
        int[] nodeEdgeCount = new int[numEdges + 2];
        
        for(int[] edge: edges) {
            nodeEdgeCount[edge[0]]++;
            nodeEdgeCount[edge[1]]++;
        }
        
        for(int i=0;i<nodeEdgeCount.length;i++) {
            if(nodeEdgeCount[i] == numEdges) {
                return i;
            }
        }
        
        return -1;
        
        
    }
}