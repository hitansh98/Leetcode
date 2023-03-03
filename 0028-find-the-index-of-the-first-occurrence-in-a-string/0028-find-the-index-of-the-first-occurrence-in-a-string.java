class Solution {
    public int strStr(String haystack, String needle) {
        // int ptr=0;
        
        return haystack.indexOf(needle);
        
//         if(haystack.length()<needle.length()){
//             return -1;
//         }
        
//         if(haystack.length()==needle.length()){
//             if(haystack.equals(needle)){
//                 return 0;
//             }
//             return -1;
//         }
        
//         while(ptr<haystack.length()-needle.length()+1){
//             boolean flag = true;
//             for(int i=0;i<needle.length();i++){
//                 if(needle.charAt(i)!=haystack.charAt(ptr+i)){
//                     flag=false;
//                     break;
//                 }
//             }
//             if(flag){
//                 return ptr;
//             }
//             ptr++;
//         }
        
//         return -1;
        
    }
}