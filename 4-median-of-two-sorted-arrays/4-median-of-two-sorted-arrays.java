class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int res[]=new int[n+m];
        int i=0,j=0,k=0;
        while(i<m && j<n)
        {
            if(nums1[i]<nums2[j])
            {
                res[k++]=nums1[i++];
            }
            else{
                res[k++]=nums2[j++];
            }
        }
        if(i<m){
            while(i<m)
                res[k++]=nums1[i++];
        }
        if(j<n){
            while(j<n)
                res[k++]=nums2[j++];
        }
        n=n+m;
        if(n%2==1)
            return res[((n+1)/2)-1];
        else
            return ((double)res[(n/2)-1]+(double)res[(n/2)])/2.0;
    }
}