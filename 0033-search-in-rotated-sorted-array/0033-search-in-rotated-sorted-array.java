class Solution {
    public int search(int[] nums, int target) {
        int ind = minele(nums);
        int bs1=binsearch(nums,0,ind-1,target);
        int bs2=binsearch(nums,ind,nums.length-1, target);
        if(bs1==-1 && bs2==-1)
            return -1;
        else
        {
            return Math.max(bs1,bs2);
        }
    }
    private int minele(int[] nums)
    {
        int str=0;
        int end=nums.length-1;
        while(str<=end)
        {
            int mid = str + (end-str)/2;
            if(nums[str]<=nums[end])
                return str;
            int n=nums.length;
            int next = (mid+1)%n;
            int prev = (mid+n-1)%n;
            if(nums[mid]<=nums[next] && nums[mid]<=nums[prev])
                return mid;
            else if(nums[str]<=nums[mid])
                str=mid+1;
            else
                end=mid-1;
        }
        return 0;
    }
    private int binsearch(int[] nums,int str,int end, int k)
    {
        if(str>end)
            return -1;
        int mid = str + (end-str)/2;
        if(nums[mid]==k)
            return mid;
        else if(nums[mid]>k)
            return binsearch(nums,str,mid-1,k);
        else 
            return binsearch(nums,mid+1,end,k);
            
    }
}