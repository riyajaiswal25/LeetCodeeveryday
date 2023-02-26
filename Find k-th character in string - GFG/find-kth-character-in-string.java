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
            
            String input[] = read.readLine().split(" ");
            int m = Integer.parseInt(input[0]);
            int n = Integer.parseInt(input[1]);
            int k = Integer.parseInt(input[2]);
            Solution ob = new Solution();
            System.out.println(ob.kthCharacter(m,n,k));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    char kthCharacter(int m, int n, int k) {
        // code here
        String res=Integer.toBinaryString(m);
        int len=res.length();
        while(n!=0)
        {
            String up="";
            for(int i=0;i<len;i++)
            {
                if(res.charAt(i)=='0')
                {
                    up+="01";
                }
                else
                {
                    up+="10";
                }
            }
            res=up;
            len=up.length();
            n--;
        }
        return (res.charAt(k-1));
        }
}