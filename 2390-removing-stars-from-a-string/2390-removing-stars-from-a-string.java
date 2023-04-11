class Solution {
    public String removeStars(String s) {
        char[] arr = s.toCharArray();
        Stack<Character> st = new Stack<Character>();
        
        for(int i=0;i<arr.length;i++){
            if(arr[i] != '*'){
                st.push(arr[i]);
            }
            
            else{
                st.pop();
            }
        }
        String res = "";
        while(!st.isEmpty()){
            res = st.pop() + res;
        }
        
        return res;
        
    }
}