//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		sc.nextLine();
		while(t-->0)
		{
		    String s=sc.nextLine();
		    
		    System.out.println(printNumber(s,s.length()));
		}
		
	}

// } Driver Code Ends
//User function Template for Java


//Function to find matching decimal representation of a string as on the keypad.
public static String printNumber(String s, int n) 
{
    //Your code here
    char[] ch=s.toCharArray();
    String ans="";
    for(int i=0;i<n;i++)
    {
        if(ch[i]=='a' || ch[i]=='b' || ch[i]=='c')
        ans=ans+'2';
        else if(ch[i]=='d' || ch[i]=='e' || ch[i]=='f')
        ans=ans+'3';
        else if(ch[i]=='g' || ch[i]=='h' || ch[i]=='i')
        ans=ans+'4';
        else if(ch[i]=='j' || ch[i]=='k' || ch[i]=='l')
        ans=ans+'5';
        else if(ch[i]=='m' || ch[i]=='n' || ch[i]=='o')
        ans=ans+'6';
        else if(ch[i]=='p' || ch[i]=='q' || ch[i]=='r' || ch[i]=='s')
        ans=ans+'7';
        else if(ch[i]=='t' || ch[i]=='u' || ch[i]=='v')
        ans=ans+'8';
        else ans=ans+'9';
    }
    return ans;
}

//{ Driver Code Starts.

}

// } Driver Code Ends