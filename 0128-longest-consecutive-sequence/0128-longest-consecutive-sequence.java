class Solution {
    public int longestConsecutive(int[] nums) {
       if(nums.length==0)
           return 0;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++)
            set.add(nums[i]);
        int maxi=0;
        for(int i=0;i<nums.length;i++)
        {
            int val=nums[i];
            if(!set.contains(val-1))
            {
                int c=1;
                while(set.contains(val+1))
                {
                    c++;
                    val++;
                }
                maxi=Math.max(maxi,c);
            }
        }
        return maxi;
    }
}