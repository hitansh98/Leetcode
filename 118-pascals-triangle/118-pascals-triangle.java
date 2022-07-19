class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> al = new ArrayList<List<Integer>>();
        ArrayList<Integer> temp1 = new ArrayList<Integer>();
        temp1.add(1);
        al.add(temp1);
        if(numRows==1) return al;
        ArrayList<Integer> temp2 = new ArrayList<Integer>(temp1);
        temp2.add(1);
        al.add(temp2);
        if(numRows==2) return al;
        
        for(int i=2;i<numRows;i++){
            // System.out.println()
            ArrayList<Integer> temp3 = new ArrayList<Integer>();
            temp3.add(1);
            for(int j=0;j<temp2.size()-1;j++){
                temp3.add(temp2.get(j) + temp2.get(j+1));
            }
            temp3.add(1);
            al.add(temp3);
            temp2 = temp3;
        }
        
        return al;
    }
}