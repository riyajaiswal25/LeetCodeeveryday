class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length==0)
            return 0;
        int n=prices.length;
        int[][] dp = new int[n+1][2];
        for(int[] row:dp)
            Arrays.fill(row,-1);
        return f(prices,0,0,prices.length,dp);
    }
    private int f(int[] prices, int ind, int buy, int n,int[][] dp)
    {
        if(ind>=n)
            return 0;
        int op1, op2;
        int maxi=0;
        if(dp[ind][buy]!=-1)
            return dp[ind][buy];
        if(buy == 0)
        {
            op1 = 0+f(prices,ind+1,0,n,dp);
            op2 = -prices[ind]+f(prices,ind+1,1,n,dp);
            maxi = (int)Math.max(op1,op2);
        }
        else{
            op1 = f(prices,ind+1,1,n,dp);
            op2 = prices[ind]+f(prices,ind+2,0,n,dp);
            maxi = (int)Math.max(op1,op2);
        }
       return dp[ind][buy]=maxi;
    }
}