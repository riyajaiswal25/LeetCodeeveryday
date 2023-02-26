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
    		int[] res = new Sol().count (s);
    		
    		for (int i = 0; i < 4; i++)
    		    System.out.println (res[i]);
        }
        
    }
}
// Contributed By: Pranay Bansal

// } Driver Code Ends


//User function Template for Java

class Sol
{
    int[] count (String s)
    {
        // your code here       
        int l=0, u=0, n=0, sp=0;
        for(int i=0;i<s.length();i++)
        {
            if(Character.isUpperCase(s.charAt(i))==true)
            u++;
            else if(Character.isLowerCase(s.charAt(i))==true)
            l++;
            else if(Character.isDigit(s.charAt(i))==true)
            n++;
            else
            sp++;
        }
        int arr[]=new int[4];
        arr[0]=u;
        arr[1]=l;
        arr[2]=n;
        arr[3]=sp;
        return arr;
    }
}