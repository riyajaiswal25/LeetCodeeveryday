//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            String s = sc.next();
            Solution obj = new Solution();
            System.out.println(obj.reverseWords(s));
            t--;
        }
    }
}

// } Driver Code Ends



class Solution 
{
    //Function to reverse words in a given string.
    String reverseWords(String S)
    {
        // code here 
        Stack<String> st=new Stack<>();
        int n=S.length();
        int k=0;
        for(int i=0;i<n;i++)
        {
            if(i==n-1)
            {
                st.push(S.substring(k,i+1));
            }
            if(S.charAt(i)=='.')
            {
                st.push(S.substring(k,i));
                k=i+1;
            }
        }
        StringBuilder sb=new StringBuilder();
        while(st.isEmpty()!=true)
        {
            sb.append(st.pop());
            sb.append('.');
        }
        String str=sb.substring(0,n).toString();
        return str;
    }
}