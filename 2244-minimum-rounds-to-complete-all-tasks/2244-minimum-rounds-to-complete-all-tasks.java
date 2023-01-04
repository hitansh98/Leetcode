class Solution {
    public int minimumRounds(int[] tasks) {
        Map<Integer, Integer> hm = new HashMap<>();
        for(int i=0;i<tasks.length;i++){
            int count = hm.getOrDefault(tasks[i], 0);
            hm.put(tasks[i], ++count);
        }
        
        System.out.println(hm);
        int res= 0;
        for(Map.Entry<Integer, Integer> me: hm.entrySet()){
            int value = me.getValue();
            
            if(value<2){
                return -1;
            }
            
            while(value>0){
                if(value==4){
                    res+=2;
                    value=0;
                }
                else if(value==2 || value==3){
                    res+=1;
                    value=0;
                }
                else{
                    res+=1;
                    value-=3;
                }
            }
        }
        
        return res;
    }
}