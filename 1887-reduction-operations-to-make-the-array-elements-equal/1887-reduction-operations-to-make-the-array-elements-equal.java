class Solution {
    public int reductionOperations(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int x=nums[0];
        int ans=0;
        for(int i=1;i<n;i++)
        {
            if(x!=nums[i])
            {
                ans+=n-i;
                x=nums[i];
            }
        }
        return ans;
    }
}