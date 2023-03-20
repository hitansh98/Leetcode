class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        // return false;
        
        
        
        
        
        
        List<Integer> bed = new ArrayList<>();
        
        bed.add(0);
        
        for(int i=0;i<flowerbed.length;i++){
            bed.add(flowerbed[i]);
        }
        
        bed.add(0);
        
        // System.out.println(bed);
        int count = 0;
        int result = 0;
        
        for(int i=0;i<bed.size();i++){
            // System.out.println(i+" "+count);
            if(bed.get(i) == 0){
                count++;
            }
            else{
                result += (count-1)/2;
                count = 0;
            }
        }
        
        result+=(count-1)/2;
            
//         int left1 = 0;
//         int right = 1;
//         while(right<bed.size() && left1<bed.size()){
//             // System.out.println(bed);
//             while(right<bed.size() && left1<bed.size() && bed.get(right) != bed.get(left1)){
//                 right++;
//                 left1++;
//             }
//             int windowSize = right - left;
//             while(windowSize-- > 0){
//                 bed.remove(left);
//             }
//             left = right;
//             left1 = right;
//         }
        
//         System.out.println(bed);
        
//         int maxFlowers = 0;
//         if(bed.size() % 2==0){
//             maxFlowers = bed.size()/2;
//         }
//         else{
//             maxFlowers += bed.size()%2 + bed.size()/2;
//         }
//         // System.out.println(maxFlowers);
        // System.out.println(result);
        
        return n<=result ? true : false;
    }
}