class Solution {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int rect1 = (C-A)*(D-B);
        int rect2 = (G-E)*(H-F);
        
         if(A >= G || B >= H || C <= E || D <= F){
            return rect1 + rect2;
        }
        
        
        int l1 = Math.min(C,G) - Math.max(A,E);
        int l2 = Math.min(D,H) - Math.max(B,F);
        
        return rect1 + rect2 - (l1*l2);
    }
}