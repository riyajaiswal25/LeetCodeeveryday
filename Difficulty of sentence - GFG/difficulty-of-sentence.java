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
            String S = read.readLine();
            Solution ob = new Solution();
            int result = ob.calcDiff(S);
            
            System.out.println(result);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
   
    public int check(String s)
    {
        int c=0, v=0, cc=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
            {
            v++;
            cc=0;
            }
            else
            {
            cc++;
            c++;
            if(cc==4)
            return 1;
            }
        }
            if(c>v)
            {
                return 1;
            }
            return 0;
            
        }
        
    
    public int calcDiff(String s)
    {
        //code here
        String[] strArray = null;  
        strArray = s.split(" ");
         int h=0,e=0;
         for(int i=0;i<strArray.length;i++)
         {
             if(check(strArray[i])==1)
             h++;
             else
             e++;
         }
        return 5*h+3*e;
    }
}