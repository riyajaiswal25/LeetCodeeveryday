class Solution {
    public int[] getAverages(int[] nums, int k) {
        int[] ans=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(i-k<0 || i+k>=nums.length)
                ans[i]=-1;
        }
         long[] prefixSum=new long[nums.length+1];
        for(int i=0;i<nums.length;++i){
            prefixSum[i+1]=prefixSum[i]+nums[i];
        }
        
        for(int i=k;i+k<nums.length;++i){
            ans[i]=(int)((prefixSum[i+k+1]-prefixSum[i-k])/(2*k+1));
        }
        return ans;
    }
}