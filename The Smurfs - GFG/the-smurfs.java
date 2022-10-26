//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int n = Integer.parseInt(in.readLine());
            String a[] = in.readLine().trim().split("\\s+");
            
            Solution ob = new Solution();
            System.out.println(ob.minFind(n, a));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static int minFind(int n, String a[]){
        // code here
        int rc=0, gc=0, bc=0;
        for(int i=0;i<n;i++)
        {
            if(a[i].equals("R"))
            rc++;
            else if(a[i].equals("B"))
            bc++;
            else
            gc++;
        }
        if(rc==n || bc==n || gc==n)
        return n;
        
        if((gc%2==0 && rc%2==0 && bc%2==0) || (gc%2==1 && rc%2==1 && bc%2==1))
        return 2;
        return 1;
    }
}