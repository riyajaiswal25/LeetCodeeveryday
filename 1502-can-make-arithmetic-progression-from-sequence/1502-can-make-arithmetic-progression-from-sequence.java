class Solution {
    private int diff(int a, int b)
    {
        if(a>b)
        {
            return a-b;
        }
        else
            return b-a;
    }
    public boolean canMakeArithmeticProgression(int[] arr) {
        int n=arr.length;
        Arrays.sort(arr);
        int d =diff(arr[0], arr[1]);
        boolean res=true;
        for(int i=1;i<n-1;i++)
        {
            if(d == diff(arr[i],arr[i+1]))
            {
                res=true;
            }else{
                return false;
            }
        }
        return true;
    }
}