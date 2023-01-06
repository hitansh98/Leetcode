class Solution {
    public int findMinArrowShots(int[][] points) {
        
        Arrays.sort(points, (a1, a2)-> Integer.compare(a1[0],a2[0])); //[[1,6],[2,8],[7,12],[10,16]]
        long currentEnd = Long.MAX_VALUE;
        
        int minArrows = 1;
        for(int[] point: points){
            long pointStart = point[0];
            long pointEnd = point[1];
            
            if(currentEnd >= pointStart){
                // System.out.print(point[0]+" "+point[1]+" ");
                currentEnd = Math.min(pointEnd, currentEnd);
                // System.out.println(currentEnd);
            }
            else{
                currentEnd = pointEnd;
                minArrows++;
            }
        }
        
        return minArrows;
    }
}