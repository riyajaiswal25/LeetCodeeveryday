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
            
            System.out.println(ob.reverseEqn(s));    
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution
{
   
    String reverseEqn(String S)
    {
        // your code here
       Stack<String>stack=new Stack<>();

       String ans="";

       for(int i=0;i<S.length();i++)

       {

           if(S.charAt(i)!='+' && S.charAt(i)!='-' && S.charAt(i)!='*' && S.charAt(i)!='/')

           {

               ans+=S.charAt(i);

           }

           else 

           {

               stack.push(ans);

               stack.push(Character.toString(S.charAt(i)));

               ans="";

           }

       }

       stack.push(ans);

       String fans="";

       while(stack.size()>0)

       {

           String k=stack.pop();

           fans+=k;

       }

       return fans;
        
    }
}