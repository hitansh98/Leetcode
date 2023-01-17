//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
class Rat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[][] a = new int[n][n];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++) a[i][j] = sc.nextInt();

            Solution obj = new Solution();
            ArrayList<String> res = obj.findPath(a, n);
            Collections.sort(res);
            if (res.size() > 0) {
                for (int i = 0; i < res.size(); i++)
                    System.out.print(res.get(i) + " ");
                System.out.println();
            } else {
                System.out.println(-1);
            }
        }
    }
}

// } Driver Code Ends


// User function Template for Java

// m is the given matrix and n is the order of matrix
class Solution {
    public static ArrayList<String> findPath(int[][] m, int n) {
        // Your code here
        int[][] visited = new int[n][n];
        ArrayList<String> res = new ArrayList<String>();
        dfs(m, visited, 0, 0, res, "");
        
        return res;
    }
    
    public static void dfs(int[][] m, int[][] visited, int i, int j, ArrayList<String> res, String path){
        // System.out.println(path);
        if(i<0 ||i>=m.length || j<0 || j>=m[0].length || visited[i][j]==1 || m[i][j]==0){
            return;
        }
        
        visited[i][j] = 1;
        
        if(i==m.length-1 && j==m[0].length-1){
            // System.out.println(path);
            res.add(path);
            visited[i][j] = 0;
            return;
        }
        
        dfs(m, visited, i+1, j, res, path+"D");
        dfs(m, visited, i-1, j, res, path+"U");
        dfs(m, visited, i, j+1, res, path+"R");
        dfs(m, visited, i, j-1, res, path+"L");
        
        visited[i][j] = 0;
        
    }
}