class Trie {
    
    HashMap<Character, Trie> hm;
    public String toString(){
        return this.hm.toString();
    }
    
    public Trie() {
        hm = new HashMap<>();
    }
    
    public void insert(String word) {
        Trie temp;
        Trie curr = this;
        for(int i=0;i<word.length();i++){
            if(i==0){
                if(curr.hm.containsKey(word.charAt(i))){
                    temp = curr.hm.get(word.charAt(i));
                }
                else{
                    temp = new Trie();
                }
                curr.hm.put(word.charAt(i), temp);
                curr = temp;
            }
            else{
                Trie temp2;
                if(curr.hm.containsKey(word.charAt(i))){
                    temp2 = curr.hm.get(word.charAt(i));
                }
                else{
                    temp2 = new Trie();
                }
                curr.hm.put(word.charAt(i), temp2);
                curr = temp2;
            }
            
            if(i==word.length()-1){
                curr.hm.put('#', null);
            }
        }
        
        // System.out.println(this);
    }
    
    public boolean search(String word) {
        Trie temp = this;
        for(int i=0;i<word.length();i++){
            if(temp == null) return false;
            if(!temp.hm.containsKey(word.charAt(i))){
                return false;
            }
            if(i==word.length()-1){
                if(!temp.hm.get(word.charAt(i)).hm.containsKey('#')){
                    return false;
                }
            }
            else{
                temp = temp.hm.get(word.charAt(i));
            }
        }
        
        return true;
    }
    
    public boolean startsWith(String prefix) {
        Trie temp = this;
        
        for(int i=0;i<prefix.length();i++){
            if(temp == null) return false;
            
            if(!temp.hm.containsKey(prefix.charAt(i))){
                return false;
            }
            
            if(i != prefix.length()-1){
                temp =temp.hm.get(prefix.charAt(i));
            }
            
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */