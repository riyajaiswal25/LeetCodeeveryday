//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0)
        {
            String s = in.readLine();
            
            Solution ob = new Solution();
            
            System.out.println(ob.shortestPath(s));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    String shortestPath (String S)
    {
        // your code here
        HashMap<Character, Integer> map=new HashMap<>();
        char ch[]=new char[S.length()];
        for(int i=0;i<S.length();i++)
        {
            map.put(S.charAt(i),map.getOrDefault(S.charAt(i),0)+1);
        }
        for(int i=0;i<S.length();i++)
        {
            if(S.charAt(i)=='N' && map.containsKey('S'))
            map.put('S',map.get('S')-1);
            else if(S.charAt(i)=='S' && map.containsKey('N'))
            map.put('N',map.get('N')-1);
            else if(S.charAt(i)=='E' && map.containsKey('W'))
            map.put('W',map.get('W')-1);
            else if(S.charAt(i)=='W' && map.containsKey('E'))
            map.put('E',map.get('E')-1);
        }
        int i=0;
        for(Character c:map.keySet())
        {
        if(map.get(c)>0)
        {
            int j=map.get(c);
        while(j-->0){
        ch[i]=c;
        i++;
        }
        }
        }
        Arrays.sort(ch);
        return String.valueOf(ch);
    }
}