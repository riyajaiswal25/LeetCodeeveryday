class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int low=0, high=arr.length-k;
        while(low < high)
        {
            int mid = low+(high-low)/2;
            if(x-arr[mid] > arr[mid+k]-x)
            {
                low=mid+1;
            }
            else{
                high=mid;
            }
        }
        ArrayList<Integer> res=new ArrayList<>();
        for(int i=0;i<k;i++)
        {
            res.add(arr[low+i]);
        }
        return res;
    }
}