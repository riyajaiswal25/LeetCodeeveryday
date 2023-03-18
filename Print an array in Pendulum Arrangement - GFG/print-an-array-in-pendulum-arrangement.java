//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            int arr[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            Compute obj = new Compute();
            int answer[] = obj.pendulumArrangement(arr, n);
            int sz = answer.length;

            StringBuilder output = new StringBuilder();
            for (int i = 0; i < sz; i++) output.append(answer[i] + " ");
            System.out.println(output);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Compute {
    public int[] pendulumArrangement(int arr[], int n) {
        // Write your code here
        int[] ans=new int[n];
        Arrays.sort(arr);
        int j,k;
        if(n%2==0)
        {
        ans[(n-1)/2]=arr[0];
        j=((n-1)/2)-1;
        k=((n-1)/2)+1;
        }
        else{
        ans[n/2]=arr[0];
        j=(n/2)-1;
        k=(n/2)+1;
        }
        int i=1;
        while(i<n)
        {
            if(k<n)
            ans[k++]=arr[i];
            i++;
            if(j>=0)
            ans[j--]=arr[i];
            i++;
        }
        return ans;
    }
}