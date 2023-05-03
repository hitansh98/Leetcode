class Solution {
    public double average(int[] salary) {
        double maxVal = 0;
        double minVal = Integer.MAX_VALUE;
        
        double sum = 0;
        
        for(int sal: salary){
            if(sal > maxVal){
                maxVal = sal;
            }
            
            if(sal < minVal){
                minVal = sal;
            }
            
            sum += sal;
        }
        // System.out.println(maxCount+" "+maxVal);
        // System.out.println(minCount+" "+minVal);
        double avg = (sum - maxVal - minVal) / (salary.length - 2);
        
        return avg;
    }
}