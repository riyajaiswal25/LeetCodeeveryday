class Solution {
    public int[][] generateMatrix(int n) {
        int top=0, bottom=n-1, left=0, right=n-1, k=1;
        int[][] ans=new int[n][n];
        while(top<=bottom && left<=right)
        {
            for(int i=left;i<=right;i++)
            {
                ans[top][i]=k;
                k++;
            }
            top++;
            for(int i=top;i<=bottom;i++)
            {
                ans[i][right]=k;
                k++;
            }
            right--;
            if(top<=bottom)
            {
                for(int i=right;i>=left;i--)
                {
                    ans[bottom][i]=k;
                    k++;
                }
                bottom--;
            }
                if(left<=right)
                {
                    for(int i=bottom;i>=top;i--)
                    {
                        ans[i][left]=k;
                        k++;
                    }
                    left++;
                }
        }
        return ans;
    }
}