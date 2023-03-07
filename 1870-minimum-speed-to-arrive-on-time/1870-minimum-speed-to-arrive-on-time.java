class Solution {
    public int minSpeedOnTime(int[] dist, double hour) {
        int low = 1;
        
        
        int max = 0;
        for(int d:dist){
            max = Math.max(d, max);
        }
        
        int high = Integer.MAX_VALUE;
        
        if(Math.ceil(hour) < dist.length){
            return -1;
        }
        
        while(low<high){
            int mid = (high-low)/2 + low;
            double time = 0;
            
            // for(int d: dist){
            //     System.out.println("For d: "+d+" ");
            //     time += Math.ceil(d/mid);
            //     System.out.println("Time taken: "+time);
            // }
            // System.out.println("For mid: "+mid);
            for(int i=0;i<dist.length;i++){
                // System.out.print("For d: "+dist[i]+" ");
                // System.out.println(((dist[i] - (dist[i]%mid))/mid) + 1);
                if(i==dist.length-1){
                    time += (double) dist[i]/mid;
                }
                else{
                    time += Math.ceil((double)dist[i]/mid);
                }
                // System.out.println("Time taken: "+time);
            }
            
            if(time>hour){
                low = mid+1;
            }
            else{
                high = mid;
            }
        }
        
        return low;
    }
}