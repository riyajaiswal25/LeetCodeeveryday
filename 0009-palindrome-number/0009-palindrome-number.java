class Solution {
    public boolean isPalindrome(int x) {
        int n=x;
        int num=0;
        if(x<0)
            return false;
        while(n!=0)
        {
            num=num*10+n%10;
            n=n/10;
        }
        System.out.print(x+" "+num);
        if(x==num)
            return true;
        else
            return false;
    }
}