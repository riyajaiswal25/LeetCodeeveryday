class Solution {
    public void rotate(int[] arr, int k) {
        int[] temp=new int[arr.length];
        k=k%arr.length;
        int j=0;
        int n=arr.length;
        for(int i=n-k;i<n;i++)
        {
            temp[j++]=arr[i];
        }
        for(int i=0;i<n-k;i++)
            temp[j++]=arr[i];
        for(int i=0;i<n;i++)
            arr[i]=temp[i];
    }
}