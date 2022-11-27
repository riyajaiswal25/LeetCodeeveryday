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
            
            String input[] = read.readLine().split(" ");
            String a = input[0];
            String b = input[1];
            Solution ob = new Solution();
            System.out.println(ob.addBinary(a,b));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    String addBinary(String A, String B) {
        // code here
        int n=A.length();
        int m=B.length();
        int c=0;
        StringBuilder res=new StringBuilder();
        int i=n-1;
        int j=m-1;
        while(i>=0 || j>=0)
        {
            int sum=0;
            if(i>=0 && A.charAt(i)=='1')
            sum++;
            if(j>=0 && B.charAt(j)=='1')
            sum++;
            sum+=c;
            char bit='0';
            if(sum>1)
            c=1;
            else
            c=0;
            if(sum==3 || sum==1)
            bit='1';
            res.append(bit);
            i--;
            j--;
            
        }
        if(c==1)
        res.append('1');
        res.reverse();
        i=0;
        int reslen=res.length();
        while(i<reslen-1)
        {
            if(res.charAt(i)=='1')
            break;
            i++;
        }
        return res.substring(i,reslen);
    }
}