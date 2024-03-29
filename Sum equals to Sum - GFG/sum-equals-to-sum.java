//{ Driver Code Starts
//Initial Template for Java





import java.io.*;
import java.util.*;

class Array {
	public static void main (String[] args) {
	    Scanner sc=new Scanner(System.in);
	    
	    int t=sc.nextInt(); //input testcases
	    
	    while(t-->0) //Loop until we exhaust all testcases
	    {
	        int n=sc.nextInt(); //Input size of array n
	        int arr[]=new int[n]; //Declaring the array
	        for(int i=0;i<n;i++)
	        {
	            int x=sc.nextInt();
	            arr[i]=x; //Assigning elements to array
	        }
	        
	        Solution ob=new Solution(); //object to call the function
	        System.out.println(ob.findPairs(arr,n)); //The functions you complete
	        
	    }
	}
}



// } Driver Code Ends


//User function Template for Java


class Solution
{ 
    public int findPairs(int arr[],int n) 
    { 
        //code here.
        HashMap<Integer,Boolean> map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                int sum=arr[i]+arr[j];
                if(map.containsKey(sum))
                return 1;
                map.put(sum,true);
            }
        }
        return 0;
    }
}