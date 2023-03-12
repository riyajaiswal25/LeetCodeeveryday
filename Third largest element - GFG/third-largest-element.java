//{ Driver Code Starts
import java.util.Scanner;
import java.util.*;
import java.io.*;

class ThirdLargestElement
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			int n =sc.nextInt();
			int arr[] = new int[n];
			for(int i=0;i<n;i++)
				arr[i] = sc.nextInt();
			Solution g = new Solution();
			System.out.println(g.thirdLargest(arr,n));
		t--;
		}
	}
}
// } Driver Code Ends


class Solution
{
    int thirdLargest(int a[], int n)
    {
	    // Your code here
	    int max=0, smax=0, tmax=0;
	    for(int i=0;i<n;i++)
	    {
	        if(a[i]>max)
	        {
	            tmax=smax;
	            smax=max;
	            max=a[i];
	        }
	        else if(a[i]<max && a[i]>smax)
	        {
	            tmax=smax;
	            smax=a[i];
	        }
	        else if(a[i]<smax && a[i]>tmax)
	        {
	            tmax=a[i];
	        }
	    }
	    return tmax;
    }
}
