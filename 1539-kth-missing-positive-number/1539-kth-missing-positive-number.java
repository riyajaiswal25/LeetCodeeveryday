class Solution {
    public int findKthPositive(int[] arr, int k) {
        int j=1;
        int i=0;
        while(true)
        {
            if(i<arr.length && j==arr[i])
            {
                i++;
            }
            else
            {
                k--;
            }
            if(k==0)
                break;
            j++;
        }
        return j;
    }
}