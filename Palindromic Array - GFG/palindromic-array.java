//{ Driver Code Starts
import java.util.*;
class PalindromicArray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
			int n = sc.nextInt();
			int[] a = new int[n];
			for(int i = 0 ;i < n; i++)
				a[i]=sc.nextInt();
			GfG g = new GfG();
			System.out.println(g.palinArray(a , n));
		}
	}
}
// } Driver Code Ends


/*Complete the Function below*/
class GfG
{
    public static boolean checkpal(int n)
    {
        int x=n;
        int rev=0;
        while(n!=0)
        {
            int a=n%10;
            n=n/10;
            rev=rev*10+a;
        }
        if(rev==x)
        return true;
        else 
        return false;
    }
	public static int palinArray(int[] a, int n)
           {
                  //add code here.
                  int c=0;
                  for(int i=0;i<n;i++)
                  {
                      if(checkpal(a[i])==true)
                      c++;
                  }
                  if(c==n)
                  return 1;
                  else 
                  return 0;
           }
}