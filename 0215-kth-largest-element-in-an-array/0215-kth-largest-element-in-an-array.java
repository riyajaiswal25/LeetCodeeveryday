class Solution {
    void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    int partition(int nums[],int low,int high){
        int pivot=nums[high];
        int i=low-1,j=low;
        while(j<high){
            if(nums[j]<pivot){
                i++;
                swap(nums,i,j);
            }
            j++;
        }
        swap(nums,i+1,j);
        return i+1;
    }
    public int findKthLargest(int[] nums, int k) {
        int low=0,high=nums.length-1;
        k=nums.length-k;
        while(true){
            int temp=partition(nums,low,high);
            System.out.print(temp+" ");
            if(temp==k)
            return nums[temp];
            else if(temp<k)
            low=temp+1;
            else
            high=temp-1;
        }
    }
}