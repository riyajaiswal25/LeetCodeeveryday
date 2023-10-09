class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans=new int[]{-1,-1};
        if(nums.length==0)
            return ans;
        int l=0,h=nums.length-1;
        while(l<h){
            int mid=(l+h)/2;
            if(nums[mid]>=target){
                h=mid;
            }
            else{
                l=mid+1;
            }
        }
        if(nums[l] != target)
        {
            return ans;
        }
        ans[0]=l;
        h=nums.length;
        while(l<h){
            int mid=(l+h)/2;
            if(nums[mid]>target){
                h=mid;
            }
            else{
                l=mid+1;
            }
        }
        ans[1]=l-1;
        return ans;
    }
}