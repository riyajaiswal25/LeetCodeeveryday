class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long ans=0, num=0;
        for(int n:nums)
        {
            if(n==0)
                num++;
            else
                num=0;
            ans+=num;
        }
        return ans;
    }
}