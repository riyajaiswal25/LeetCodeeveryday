class Solution {
    private int checkEven(int num)
    {
        int cnt=0;
        while(num!=0)
        {
            int a=num%10;
            num=num/10;
            cnt++;
        }
        return cnt;
    }
    public int findNumbers(int[] nums) {
        int c=0;
        for(int num:nums)
        {
            if(checkEven(num)%2==0)
                c++;
        }
        return c;
        
    }
}