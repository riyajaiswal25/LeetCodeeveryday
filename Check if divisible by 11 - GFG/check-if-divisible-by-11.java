//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            String s = sc.next ();

    		System.out.println (new Sol().divisibleBy11 (s));
        }
        
    }
}

// Contributed By: Pranay Bansal
// } Driver Code Ends


//User function Template for Java

class Sol
{
    int divisibleBy11 (String S)
    {
        // Your Code Here
        int t=0;
        for(int i=0;i<S.length();i++)
        {
            t=t*10+S.charAt(i)-'0';
            t=t%11;
        }
        if(t%11==0)
        return 1;
        else
        return 0;
    }
}