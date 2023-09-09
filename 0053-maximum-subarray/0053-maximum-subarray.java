class Solution {
    public int maxSubArray(int[] nums) {
        int sum=Integer.MIN_VALUE;
        int c=0;
        for(int i=0;i<nums.length;i++)
        {
            c=Math.max(nums[i],nums[i]+c);
            sum=Math.max(c,sum);
        }
        return sum;
    }
}