class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int res=nums[0]+nums[1]+nums[nums.length-1];
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++)
        {
            int j=i+1;
            int k=nums.length-1;
            while(j<k)
            {
                int curr=nums[i]+nums[j]+nums[k];
                if(curr>target)
                    k--;
                else
                    j++;
                if(Math.abs(curr-target)<Math.abs(res-target))
                    res=curr;
            }
        }
        return res;
    }
}