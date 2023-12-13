class Solution {
    public int maxProduct(int[] nums) {
        int prod=1;
        int maxp=0;
        for(int i=0;i<nums.length-1;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                prod=(nums[i]-1)*(nums[j]-1);
                if(prod>maxp)
                {
                    maxp=prod;
                }
            }
        }
        return maxp;
    }
}