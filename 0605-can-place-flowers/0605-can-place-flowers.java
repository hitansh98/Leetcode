class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        
        int[] bed = new int[flowerbed.length+2];
        
        bed[0] = 0;
        bed[bed.length-1] = 0;
        

        for(int i=0;i<flowerbed.length;i++){
            bed[i+1] = flowerbed[i];
        }
        
        // System.out.println(bed);
        int count = 0;
        int result = 0;
        
        for(int i=0;i<bed.length;i++){
            // System.out.println(i+" "+count);
            if(bed[i] == 0){
                count++;
            }
            else{
                result += (count-1)/2;
                count = 0;
            }
        }
        
        result+=(count-1)/2;
       
        
        return n<=result ? true : false;
    }
}