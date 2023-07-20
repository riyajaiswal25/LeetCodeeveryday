class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int n1=text1.length();
        int n2=text2.length();
        int[][] dp=new int[n1+1][n2+1];
        for(int[] row:dp)
            Arrays.fill(row,-1);
        return f(text1,n1,text2,n2,dp);
    }
    private int f(String text1, int n1, String text2, int n2, int[][] dp)
    {
        if(n1<=0 || n2<=0)
            return 0;
        if(dp[n1][n2] != -1)
            return dp[n1][n2];
        if(text1.charAt(n1-1)==text2.charAt(n2-1))
            return dp[n1][n2]=1+f(text1,n1-1,text2,n2-1,dp);
        else
            return dp[n1][n2]=(int)Math.max(f(text1,n1,text2,n2-1,dp),f(text1,n1-1,text2,n2,dp));
    }
}