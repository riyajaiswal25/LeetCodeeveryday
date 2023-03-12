//{ Driver Code Starts
import java.util.Scanner;
import java.lang.Math;

class Convert_To_Five {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            System.out.println(new GfG().convertfive(N));
            T--;
        }
    }
}
// } Driver Code Ends


class GfG {
    int convertfive(int num) {
        // Your code here
        int a,rev=0;
        while(num!=0)
        {
            a=num%10;
            num=num/10;
            if(a==0)
            rev=rev*10+5;
            else
            rev=rev*10+a;
        }
        int n=0;
        while(rev!=0)
        {
            a=rev%10;
            rev=rev/10;
            n=n*10+a;
        }
        return n;
    }
}