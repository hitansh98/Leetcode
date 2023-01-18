//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class Job {
    int id, profit, deadline;
    Job(int x, int y, int z){
        this.id = x;
        this.deadline = y;
        this.profit = z; 
    }
}

class GfG {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //testcases
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
            String inputLine[] = br.readLine().trim().split(" ");
            
            //size of array
            int n = Integer.parseInt(inputLine[0]);
            Job[] arr = new Job[n];
            inputLine = br.readLine().trim().split(" ");
            
            //adding id, deadline, profit
            for(int i=0, k=0; i<n; i++){
                arr[i] = new Job(Integer.parseInt(inputLine[k++]), Integer.parseInt(inputLine[k++]), Integer.parseInt(inputLine[k++]));
            }
            
            Solution ob = new Solution();
            
            //function call
            int[] res = ob.JobScheduling(arr, n);
            System.out.println (res[0] + " " + res[1]);
        }
    }
}
// } Driver Code Ends


class Solution
{
    //Function to find the maximum profit and the number of jobs done.
    int[] JobScheduling(Job arr[], int n)
    {
        // Your code here
        // PriorityQueue<Job> pq = new PriorityQueue<Job>((a1,a2)->a2.profit-a1.profit);
        
        // for(Job j: arr){
        //     pq.add(j);
        // }
        
        Arrays.sort(arr, (a, b)-> b.profit-a.profit);
        int res =0;
        int count=0;
        int[] schedule = new int[n+1];
        
        Arrays.fill(schedule, -1);
        
        for(int i=0;i<n;i++){
            Job j = arr[i];
            
            int deadline = j.deadline;
            while(schedule[deadline]!=-1){
                deadline--;
            }
            
            if(deadline!=0){
                schedule[deadline] = j.id;
                count++;
                res+=j.profit;
            }
        }
        
        return new int[]{count, res};
    }
}

/*
class Job {
    int id, profit, deadline;
    Job(int x, int y, int z){
        this.id = x;
        this.deadline = y;
        this.profit = z; 
    }
}
*/