class Solution {
    public int[] twoSum(int[] arr, int target) {
        int[] ans = new int[2];
        int i=0, j=arr.length-1;
        while(i<j)
        {
            if(arr[i]+arr[j]==target)
            {
                ans[0]=i+1;
                ans[1]=j+1;
                break;
            }
            else if(arr[i]+arr[j]<target)
            {
                i++;
            }
            else{
                j--;
            }
        }
        return ans;
    }
}