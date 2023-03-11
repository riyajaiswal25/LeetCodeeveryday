//{ Driver Code Starts
//Initial Template for Java

//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function Template for Java


            

class Solution{
    
  
    String roundToNearest(String N)
    {
        // Complete the function
        int len=N.length();
        int lastdig=N.charAt(len-1)-'0';
        if(lastdig != 0)
        {
            if(lastdig <= 5)
            {
                N=N.substring(0,len-1)+'0';
            }
            else
            {
                StringBuilder sb=new StringBuilder(N);
                sb.setCharAt(len-1,'0');
                int sum, c=1;
                for(int i=len-2;i>=0;i--)
                {
                    int currd=N.charAt(i)-'0';
                    sum=currd+c;
                    if(sum>9)
                    {
                        sb.setCharAt(i,'0');
                        c=1;
                    }
                    else{
                        sb.setCharAt(i,(char)(sum+'0'));
                        c=0;
                        break;
                    }
                }
                if(c==1)
                {
                    sb.insert(0,"1");
                }
                N=sb.toString();
            }
        }
        return N;
    }
  
    
}


//{ Driver Code Starts.

// Driver class
class Array {
    
    // Driver code
	public static void main (String[] args) throws IOException{
		// Taking input using buffered reader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		
		// looping through all testcases
		while(testcases-- > 0){
		    
		    String line1 = br.readLine().trim();
		    
		    Solution obj = new Solution();
		    
		    String res = obj.roundToNearest(line1);
		    
		    System.out.println(res);
		    
		    
		}
	}
}


// } Driver Code Ends