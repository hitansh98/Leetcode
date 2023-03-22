class Solution {
    public int minScore(int n, int[][] roads) {
        Map<Integer, Map<Integer, Integer>> hm = new HashMap<>();
        for(int i=0;i<roads.length;i++){
            int[] curr = roads[i];
            Map<Integer, Integer> temp1 = hm.getOrDefault(curr[0], new HashMap<Integer, Integer>());
            Map<Integer, Integer> temp2 = hm.getOrDefault(curr[1], new HashMap<Integer, Integer>());
            // List<int[]> temp = hm.getOrDefault(curr[0], new Map<Integer, Integer>());
            if(!temp1.containsKey(curr[1])){
                temp1.put(curr[1], curr[2]);
            }
            
            if(!temp2.containsKey(curr[0])){
                temp2.put(curr[0], curr[2]);
            }
            
            hm.put(curr[0], temp1);
            hm.put(curr[1], temp2);
        }
        
        // System.out.println(hm);
        int minVal = Integer.MAX_VALUE;
        boolean[] vis = new boolean[n+1];
        LinkedList<Integer> q = new LinkedList<>();
        q.offer(1);
        
        while(!q.isEmpty()){
            int curr = q.poll();
            // Map<Integer, Integer> m = hm.getOrDefault(curr, null);
            Map<Integer, Integer> m = hm.get(curr);
            
            if(m!=null){
                for(Map.Entry me: m.entrySet()){
                    if(!vis[(int)me.getKey()]){
                        minVal = Math.min(minVal, (int)me.getValue());
                        q.offer((int)me.getKey());
                    }
                }
            }
            
            vis[curr] = true;
        }
        
        return minVal;
    }
}