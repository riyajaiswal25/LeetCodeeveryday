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
            String N = sc.next ();

            if (new Sol().balancedNumber (N))
    		    System.out.println (1);
    		else
    		    System.out.println (0);
        }
        
    }
}
// } Driver Code Ends


//User function Template for Java

class Sol
{
    Boolean balancedNumber(String N)
    {
        // your code here       
        int sum1=0, sum2=0;
        int mid=N.length()/2;
        for(int i=0;i<mid;i++)
        {
            sum1=sum1+N.charAt(i)-'0';
        }
        for(int i=mid+1;i<N.length();i++)
        {
            sum2=sum2+N.charAt(i)-'0';
        }
        //System.out.println(sum1+" "+sum2);
        if(sum1==sum2)
        return true;
        else
        return false;
    }
}