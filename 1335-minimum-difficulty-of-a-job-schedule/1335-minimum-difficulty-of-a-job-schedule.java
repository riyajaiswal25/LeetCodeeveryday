class Solution {
    public int minDifficulty(int[] jobDifficulty, int d) {
        int len=jobDifficulty.length;
        if(d>len)
            return -1;
        int[][] dp=new int[d][len];
        for(int i[]:dp)
        {
            Arrays.fill(i,Integer.MAX_VALUE);
        }
        int maxd=0;
        for(int i=0;i<=len-d;i++)
        {
            maxd=Math.max(maxd,jobDifficulty[i]);
            dp[0][i]=maxd;
        }
        for(int i=1;i<d;i++)
        {
            for(int j=i;j<=len-d+i;j++)
            {
                int cday=jobDifficulty[j];
                int res=Integer.MAX_VALUE;
                for(int k=j-1;k>=i-1;k--){
                    res=Math.min(res,dp[i-1][k]+cday);
                    cday=Math.max(cday,jobDifficulty[k]);
                }
                dp[i][j]=res;
            }
        }
        return dp[d-1][len-1];
    }
}