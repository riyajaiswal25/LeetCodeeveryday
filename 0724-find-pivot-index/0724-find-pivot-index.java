class Solution {
    public int pivotIndex(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++)
            sum+=nums[i];
        int psum=0,ssum=sum-nums[0];
        if(psum==ssum)
            return 0;
        for(int i=1;i<nums.length;i++)
        {
            
            psum+=nums[i-1];
            ssum-=nums[i];
            if(psum==ssum)
                return i;
        }
       return -1;
    }
}