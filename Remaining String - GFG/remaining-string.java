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
            String s = read.readLine();
            char ch = read.readLine().charAt(0);
            int count = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            String result = ob.printString(s,ch,count);
            
            System.out.println(result);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    String printString(String S, char ch, int count) {
        // code here
        StringBuilder res=new StringBuilder();
        int c=0;
        for(int i=0;i<S.length();i++)
        {
            if(S.charAt(i)==ch)
            c++;
            else if(c>=count)
            res.append(S.charAt(i));
            if(S.charAt(i)==ch && c>count)
            res.append(S.charAt(i));
        }
        if(res.length()>0)
        return res.toString();
        else
        return "Empty string";
    }
}