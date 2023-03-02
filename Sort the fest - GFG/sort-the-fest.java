//{ Driver Code Starts


import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        while(T-->0)
        {
            String S = sc.nextLine();
            String S1 = sc.nextLine();
            String [] s = S.split(" ");
            String [] t = S1.split(" ");
            Solution ob = new Solution();
            String res  = ob.is_common(s, t);
            System.out.println(res);
        }
    }
}

// } Driver Code Ends




class Solution
{
    public String  is_common(String [] s, String [] t)
    {
        // Code here
        HashSet<String> set=new HashSet<>();
        for(int i=0;i<s.length;i++)
        {
            set.add(s[i]);
        }
        for(int i=0;i<t.length;i++)
        {
            if(set.contains(t[i])==true)
            return "CHANGE";
        }
        return "BEHAPPY";
    }
}

