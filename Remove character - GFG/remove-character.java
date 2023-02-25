//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String string1 = read.readLine();
            String string2 = read.readLine();

            Solution ob = new Solution();
            System.out.println(ob.removeChars(string1,string2) );
        }
    }
}


// } Driver Code Ends


//User function Template for Java
class Solution{
    static String removeChars(String s1, String s2){
        // code here
        String res="";
        HashSet<Character> set=new HashSet<>();
        for(int i=0;i<s2.length();i++)
        {
            set.add(s2.charAt(i));
        }
        for(int i=0;i<s1.length();i++)
        {
            if(!set.contains(s1.charAt(i)))
            res=res+s1.charAt(i);
        }
        return res;
    }
}