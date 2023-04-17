class Solution {
    public int[] twoSum(int[] num, int target) {
        int[] ans=new int[2];
        int i=0;
        int j=num.length-1;
        while(i<=j)
        {
            if(num[i]+num[j]==target)
            {
                ans[0]=i+1;
                ans[1]=j+1;
                break;
            }
            else if(num[i]+num[j]<target)
                i++;
            else
                j--;
        }
        return ans;
    }
}