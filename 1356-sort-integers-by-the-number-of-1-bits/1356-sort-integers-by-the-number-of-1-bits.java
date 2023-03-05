class Solution {
    public int[] sortByBits(int[] arr) {
        PriorityQueue<int[]> pq = new PriorityQueue<int[]>((a,b)->(a[1] == b[1]) ? a[0]-b[0] : a[1]-b[1]);
        
        for(int num: arr){
            int onesCount = findOnesCount(num);
            pq.offer(new int[]{num, onesCount});
        }
        
        for(int i=0;i<arr.length;i++){
            arr[i] = pq.poll()[0];
        }
        
        return arr;
    }
    
    public int findOnesCount(int num){
        String binaryRep = Integer.toBinaryString(num);
        int count=0;
        for(char c: binaryRep.toCharArray()){
            if(c=='1'){
                count++;
            }
        }
        
        return count;
    }
    
    
}