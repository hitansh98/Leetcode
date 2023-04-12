class Solution {
    public String simplifyPath(String path) {
        // path = path.replaceAll("//", "/");
        String[] arr = path.split("/");
        
        // System.out.println(Arrays.toString(arr));
        StringBuilder res = new StringBuilder();
        
        Stack<String> st = new Stack<>();
        for(int i=1;i<arr.length;i++){
            if(arr[i].equals("..")){
                // System.out.println("test1");
                if(!st.isEmpty()){
                    st.pop();
                }
            }
            else if(arr[i].equals(".") || arr[i].length()==0){
                // System.out.println("test2");
                continue;
            }
            else{
                // System.out.println("test3");
                st.push(arr[i]);
            }
        }
        
        while(!st.isEmpty()){
            res.insert(0, st.pop());
            res.insert(0, "/");
        }
        
        
        return res.length()==0 ? "/" : res.toString();
    }
}