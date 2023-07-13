//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            String input_line[] = read.readLine().trim().split("\\s+");
            int arr[]= new int[N];
            for(int i = 0; i < N; i++)
                arr[i] = Integer.parseInt(input_line[i]);
            int sum = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            if(ob.isSubsetSum(N, arr, sum))
            System.out.println(1);
            else
            System.out.println(0);

            
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{


    static Boolean isSubsetSum(int N, int arr[], int sum){
        // code here
        int [][] t = new int[N][sum+1];
        for(int row[]:t)
        Arrays.fill(row,-1);
        return f(N-1,arr,sum,t);
        
    }
    static boolean f(int N, int arr[], int sum, int t[][])
    {
        if(sum==0)
        return true;
        if(N==0)
        return arr[0]==sum;
        if(t[N][sum]!=-1)
        return t[N][sum]==0?false:true;
        boolean taken = false;
        boolean notTaken = f(N-1,arr,sum,t);
        if(sum>=arr[N])
        taken = f(N-1,arr,sum-arr[N],t);
        t[N][sum]=taken || notTaken?1:0;
        return taken || notTaken;
    }
}