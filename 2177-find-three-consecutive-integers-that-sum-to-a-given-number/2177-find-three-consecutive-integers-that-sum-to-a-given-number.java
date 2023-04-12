class Solution {
    public long[] sumOfThree(long num) {
        long[] ans=new long[3];
        if(num % 3 != 0)
            return new long[0];
        long c=num/3;
        ans[0]=c-1;
        ans[1]=c;
        ans[2]=c+1;
        return ans;
    }
}