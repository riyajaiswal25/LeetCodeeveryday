//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;


class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String a = sc.next();
                    Solution obj = new Solution();
                    System.out.println(obj.solve(a));
                }
                
        }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public boolean checkcon(char ch)
    {
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
        return false;
        return true;
    }
    public String solve(String a)
    {
        //code here
        HashSet<Character> set=new HashSet<>();
        
        for(int i=0;i<a.length();i++)
        {
            if(checkcon(a.charAt(i))==true)
            {
                set.add(a.charAt(i));
            }
        }
        if(set.size()%2!=0)
        {
            return "HE!";
        }
        else{
            return "SHE!";
        }
    }
}