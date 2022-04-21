class MyHashSet {
    public List<Integer> al;
    public MyHashSet() {
        al = new ArrayList<Integer>();
    }
    
    public void add(int key) {
        if(!al.contains(key)){
            al.add(key);
            return;
        }
        return;
    }
    
    public void remove(int key) {
        if(al.contains(key)){
            al.remove(al.indexOf(key));
            return;
        }
        return;
    }
    
    public boolean contains(int key) {
        return al.contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */