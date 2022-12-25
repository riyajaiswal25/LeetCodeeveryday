class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        
        int n = nums.length;
        int[] ans = new int[queries.length];
        Arrays.sort(nums);
        int sum = 0;
        for(int i = 0;i<n;i++)
        {
            sum+=nums[i];
        }
        for(int i = 0;i<queries.length;i++)
        {
            int j = n-1;
            int size = 0;
            int currSum = sum;
            while(currSum>queries[i]&&j>=0)
            {
                currSum-=nums[j];
                size++;
                j--;
            }
            ans[i] = currSum>queries[i] ? 0 : n-size;

            
        }
        return ans;
    }
}