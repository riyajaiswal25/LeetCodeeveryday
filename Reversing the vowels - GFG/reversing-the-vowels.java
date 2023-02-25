//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            String s;
            s = sc.next();
           
            Solution ob = new Solution();
            
            System.out.println(ob.modify(s));    
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    boolean isVow(char ch)
    {
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
        return true;
        return false;
    }
    String rev(String st)
    {
        String res="";
        for(int i=st.length()-1;i>=0;i--)
        res=res+st.charAt(i);
        return res;
    }
    String modify (String s)
    {
        // your code here
        String vow="";
        for(int i=0;i<s.length();i++)
        {
            if(isVow(s.charAt(i))==true)
            vow=vow+s.charAt(i);
        }
        vow=rev(vow);
        String ans="";
        int k=0;
        for(int i=0;i<s.length();i++)
        {
            if(isVow(s.charAt(i))==true)
            {
                ans=ans+vow.charAt(k);
                k++;
            }
            else
            ans=ans+s.charAt(i);
        }
        return ans;
    }
}