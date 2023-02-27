//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());

        while(t-- > 0){
            String S = sc.nextLine();
            Solution ob = new Solution();
            List<String> ans = ob.splitString(S);
            for (String val: ans) 
                if(val == "")
                    System.out.println(-1); 
                else    
                    System.out.println(val); 
        }
    } 
} 


// } Driver Code Ends


//User function Template for Java

class Solution 
{ 
    static List<String> splitString(String S) 
    { 
        // code here 
        String S1="", S2="", S3="";
        for(int i=0;i<S.length();i++)
        {
        if(Character.isAlphabetic((int)S.charAt(i))==true)
        S1=S1+S.charAt(i);
        else if(Character.isDigit(S.charAt(i))==true)
        S2=S2+S.charAt(i);
        else
        S3=S3+S.charAt(i);
        }
        List<String> list=new ArrayList<String>();
        list.add(S1);
        list.add(S2);
        list.add(S3);
        return list;
    }
} 
