class Solution {
    private int checkEven(int num)
    {
        return (int)(Math.log10(num))+1;
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