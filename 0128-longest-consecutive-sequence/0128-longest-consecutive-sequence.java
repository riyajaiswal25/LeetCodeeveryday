class Solution {
    public int longestConsecutive(int[] nums) {
       if(nums.length<2)
           return nums.length;
        Arrays.sort(nums);
        int c=1, s=1;
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]+1 == nums[i+1])
            {
                c++;
            }
            else if(nums[i] == nums[i+1])
            {
                continue;
            }
            else
                c=1;
            s=Math.max(c,s);
        }
        return s;
    }
}