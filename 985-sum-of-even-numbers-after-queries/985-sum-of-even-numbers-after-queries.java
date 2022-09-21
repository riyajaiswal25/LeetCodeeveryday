class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int n=nums.length;
        int[] ans=new int[queries.length];
        int sum=0;
        for(int i:nums)
            if(i%2==0)
                sum+=i;
        for(int i=0;i<n;i++)
        {
            int val=queries[i][0], index=queries[i][1];
            if(nums[index]%2 == 0)
                sum-=nums[index];
            nums[index]+=val;
            if(nums[index]%2 == 0)
                sum=sum+nums[index];
            ans[i]=sum;
        }
        return ans;
    }
}