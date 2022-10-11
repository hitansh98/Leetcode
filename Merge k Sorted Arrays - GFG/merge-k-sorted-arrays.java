//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;

class GFG{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t > 0){
			int n = sc.nextInt();
			int[][] a = new int[n][n];
			for(int i = 0; i < n; i++)
				for(int j = 0; j < n; j++)
					a[i][j] = sc.nextInt();
			Solution T = new Solution();
			ArrayList<Integer> arr= T.mergeKArrays(a, n);
			for(int i = 0; i < n*n ; i++)
			    System.out.print(arr.get(i)+" ");
		    System.out.println();
		    
		    t--;
		}
	}
}


// } Driver Code Ends


//User function Template for Java


class Solution
{
    //Function to merge k sorted arrays.
    public static ArrayList<Integer> mergeKArrays(int[][] arr,int K) 
    {
        // Write your code here.
        int[] idx = new int[K];
        int[] min = new int[2];
        ArrayList<Integer> res = new ArrayList<Integer>();
        while(res.size() < K*K){
            min[0] = Integer.MAX_VALUE;
            for(int i=0;i<K;i++){
                if(idx[i]<K && arr[i][idx[i]]<min[0]){
                    min[0] = arr[i][idx[i]];
                    min[1] = i;
                }
            }
            res.add(min[0]);
            idx[min[1]]++;
        }
        
        return res;
        
    }
}