class Solution {
    public int[] findErrorNums(int[] nums) {
        int n=nums.length;
        
        int[] ans=new int[2];
        int xor=0;
        int set=0;
        int x=0,y=0;
        xor=nums[0];
        for(int i=1;i<n;i++)
            xor=xor^nums[i];
        for(int i=1;i<=n;i++)
            xor=xor^i;
        set = xor & ~(xor-1);
        for(int i=0;i<n;i++)
        {
            if((nums[i]&set)!=0)
                x=x^nums[i];
            else
                y=y^nums[i];
        }
        for(int i=1;i<=n;i++)
        {
            if((i&set)!=0)
                x=x^i;
            else
                y=y^i;
        }
        for(int i=0;i<n;i++)
        {
            if(nums[i]==x){
                ans[0]=x;
                ans[1]=y;
            }
            if(nums[i]==y)
            {
                ans[0]=y;
                ans[1]=x;
            }
        }
        return ans;
    }
}