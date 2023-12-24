class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        if(n==0 || n==1)
            return;
        int z=0, nz=0;
        while(nz<n)
        {
            if(nums[nz]!=0)
            {
                int temp=nums[nz];
                nums[nz]=nums[z];
                nums[z]=temp;
                z++;
                nz++;
            }
            else{
                nz++;
            }
        }
    }
}