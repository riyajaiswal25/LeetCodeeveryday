class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        int st=0, mins=0, maxs=0;
        boolean minf=false, maxf=false;
        long ans=0;
        for(int i=0;i<nums.length;i++)
        {
            int num=nums[i];
            if(num<minK || num>maxK)
            {
                minf=false;
                maxf=false;
                st=i+1;
            }
            if(num==minK)
            {
                minf=true;
                mins=i;
            }
            if(num==maxK)
            {
                maxf=true;
                maxs=i;
            }
            if(minf && maxf)
            {
                ans+=Math.min(mins,maxs)-st+1;
            }
        }
        return ans;
    }
}