class Solution {
    public int minDistance(String word1, String word2) {
        int n=word1.length();
        int m=word2.length();
        if(n==0)
            return m;
        if(m==0)
            return n;
        int[][] dp = new int[n+1][m+1];
        for(int[] row:dp)
            Arrays.fill(row,-1);
        return f(n,m, word1, word2, dp);
    }
    private int f(int n, int m, String word1, String word2, int[][] dp)
    {
        if(m==0)
            return n;
        if(n==0)
            return m;
        if(dp[n][m]!=-1)
            return dp[n][m];
        if(word1.charAt(n-1)==word2.charAt(m-1))
            return dp[n][m]=f(n-1,m-1,word1,word2,dp);
        else {
            return dp[n][m]=1+(int)Math.min(Math.min(f(n-1,m,word1,word2,dp),f(n,m-1,word1,word2,dp)),f(n-1,m-1,word1,word2,dp));
        }
    }
}