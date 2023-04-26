class Solution {
    public int sum(int n)
    {
        int s=0;
        while(n!=0)
        {
            s+=n%10;
            n=n/10;
        }
        return s;
    }
    public int addDigits(int num) {
        
        int n=num;
        while(n>=10)
        {
         n=sum(n);
        }
        return n;
    }
}