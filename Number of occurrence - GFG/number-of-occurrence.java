// { Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int x = Integer.parseInt(inputLine[1]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().count(arr, n, x);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java



class Solution {
    int firstocc(int[] arr,int x)
    {
        int res=-1;
        int start=0;
        int end=arr.length-1;
        
        while(start<=end)
        {
            int mid= start + (end-start)/2;
            if(arr[mid]==x)
            {
                res=mid;
                end=mid-1;
            }
            else if(x < arr[mid])
                end=mid-1;
            else
                start=mid+1;
        }
        return res;
    }
    int lastocc(int[] arr,int x)
    {
        int res=-1;
        int start=0;
        int end=arr.length-1;
        
        while(start<=end)
        {
            int mid= start + (end-start)/2;
            if(arr[mid]==x)
            {
                res=mid;
                start=mid+1;
            }
            else if(x < arr[mid])
                end=mid-1;
            else
                start=mid+1;
        }
        return res;
    }
    int count(int[] arr, int n, int x) {
       int st=firstocc(arr,x);
       int lt=lastocc(arr,x);
       if(st==-1 && lt==-1)
       return 0;
       return lt-st+1;
    }
}