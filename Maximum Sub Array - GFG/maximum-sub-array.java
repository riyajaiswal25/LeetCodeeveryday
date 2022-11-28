//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            ArrayList<Integer> ans = new Solution().findSubarray(a, n);
            for(int i:ans){
                out.print(i+" ");
            }out.println();
        }
        out.close();
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {

    ArrayList<Integer> findSubarray(int a[], int n) {
        // code here
        ArrayList<Integer> ans=new ArrayList<>();
        int sum=0, curr=0;
        ArrayList<Integer> temp=new ArrayList<>();
        for(int i:a)
        {
            if(i>=0)
            {
                temp.add(i);
                curr+=i;
            }
            else{
                if(curr>sum)
                {
                    ans.clear();
                    ans.addAll(temp);
                    sum=curr;
                }
                curr=0;
                temp.clear();
            }
        }
        if(curr>sum)
        {
            ans.clear();
            ans.addAll(temp);
            sum=curr;
            curr=0;
            temp.clear();
        }
        if(ans.size()!=0)
        return ans;
        ans.add(-1);
        return ans;
    }
}