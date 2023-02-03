class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b)->a[0]-b[0]);
        if(intervals.length==1) return intervals;
        int[][] res = helper(intervals);
        return res;
    }
    
    
    public int[][] helper(int[][] intervals){
        List<int[]> al = new ArrayList<>();
        int maxEnd = intervals[0][1];
        int start = intervals[0][0];
        
        
        
        for(int[] interval: intervals){
            if(interval[0] <= maxEnd){
                maxEnd = Math.max(interval[1], maxEnd);
            }
            else{
                int[] inter = new int[]{start, maxEnd};
                al.add(inter);
                start = interval[0];
                maxEnd = interval[1];
            }
        }
        
       //   res.add(new int[]{start, end});
       // return res.toArray(new int[0][]);
        
        al.add(new int[]{start,maxEnd});
        
        return al.toArray(new int[al.size()][2]);
        
        
    }
}