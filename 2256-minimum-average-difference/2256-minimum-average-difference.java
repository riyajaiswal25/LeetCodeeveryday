class Solution {
    public int minimumAverageDifference(int[] nums) {
        int ans=-1;
        long sum=0;
        for(int i=0;i<nums.length;i++)
            sum+=nums[i];
        long sum1=0;
        long suf;
        long min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            sum1+=nums[i];
            long pre=Math.abs(sum1/(i+1));
            if(i==nums.length-1){
                suf=0;
            }
            else{
                suf=Math.abs((sum-sum1)/(nums.length-i-1));
            }
            long avg=Math.abs(pre-suf);
            if(avg==0)
                return i;
            if(min>avg)
            {
                min=avg;
                ans=i;
            }
        }
        return ans;
    }
}