//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());

        while(t > 0){
            String S = sc.nextLine();
            Solution ob = new Solution();
            System.out.println(ob.extractMaximum(S)); 
            t--;
        }
    } 
} 



// } Driver Code Ends


//User function Template for Java

class Solution 
{ 
    static int strtoint(String s)
    {
        int t=0;
        for(int i=0;i<s.length();i++)
        t=t*10+(s.charAt(i)-'0');
        return t;
    }
    static int extractMaximum(String S) 
    { 
        // code here
        String ans="";
        int maxi=-1;
        for(int i=0;i<S.length();i++)
        {
            if(S.charAt(i)>='0' && S.charAt(i)<='9')
            {
                ans=ans+S.charAt(i);
            }
            else
            {
                if(ans.length()>0)
                maxi=Math.max(strtoint(ans),maxi);
                ans="";
            }
        }
        if(ans.length()>0)
                maxi=Math.max(strtoint(ans),maxi);
        if(maxi==-1)
        return -1;
        return maxi;
    }    
} 
