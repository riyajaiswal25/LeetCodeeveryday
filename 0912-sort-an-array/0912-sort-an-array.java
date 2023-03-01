class Solution {
    public int[] sortArray(int[] nums) {
        int[] temp=new int[nums.length];
        mergeSort(nums,0,nums.length-1,temp);
        return nums;
    }
    public void mergeSort(int[] nums, int l, int r, int[] temp)
    {
        if(l>=r)
            return;
        int mid=(l+r)/2;
        mergeSort(nums,l,mid,temp);
        mergeSort(nums,mid+1,r,temp);
        merge(nums,l,mid,r,temp);
    }
    private void merge(int[] nums, int l, int mid, int r, int[] temp)
    {
        for(int i=l;i<=r;i++)
            temp[i]=nums[i];
        int i=l;
        int j=mid+1;
        int k=l;
        while(i<=mid || j<=r)
        {
            if(i>mid || j<=r && temp[i]>temp[j])
            {
                nums[k++]=temp[j++];
            }
            else
            {
                nums[k++]=temp[i++];
            }
        }
    }
}