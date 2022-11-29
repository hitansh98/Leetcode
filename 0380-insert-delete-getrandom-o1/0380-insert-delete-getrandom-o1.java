class RandomizedSet {
    ArrayList<Integer> al;
    HashMap<Integer, Integer> locs;
    
    java.util.Random rand = new java.util.Random();
    
    public RandomizedSet() {
        al = new ArrayList<Integer>();
        locs = new HashMap<Integer, Integer>();
    }
    
    public boolean insert(int val) {
        if(!locs.containsKey(val)){
            al.add(val);
            locs.put(val, al.size()-1);
            return true;
        }
        return false;
    }
    
    public boolean remove(int val) {
        if(locs.containsKey(val)){
          //swap with last element in al.
            int lastIndex = al.size()-1;
            int currIndex = locs.get(val);
            
            if(currIndex!=lastIndex){
                int temp = al.get(lastIndex);
                al.set(lastIndex, al.get(currIndex));
                al.set(currIndex, temp);
                
                locs.put(temp, currIndex);
            }
            
            al.remove(lastIndex);
            locs.remove(val);
            return true;
        }
        return false;
    }
    
    public int getRandom() {
        return al.get(rand.nextInt(al.size()));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */