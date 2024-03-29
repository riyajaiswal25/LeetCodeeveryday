//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            
            String s = read.readLine();
            Solution ob = new Solution();
            System.out.println(ob.maxSubstring(s));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int maxSubstring(String S) {
        // code here
        char[] arr=S.toCharArray();
        int c=0, max=-1;
        for(int i=0;i<S.length();i++)
        {
            if(c<0)
            c=0;
            if(arr[i]=='0')
            c++;
            else
            c--;
            if(c>max)
            max=c;
        }
        return max;
    }
}