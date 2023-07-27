class Solution {
    public int maxProfit(int[] prices) {
        int x = 2;
        int[][][] dp = new int[prices.length+1][2][3];
        for(int[][] row:dp)
        {
            for(int[] col:row)
            {
                Arrays.fill(col,-1);
            }
        }
        return f(prices, 0, 0, x, dp);
    }
    private int f(int[] prices, int ind, int buy, int x, int[][][] dp)
    {
        if(prices.length==ind || x==0)
            return dp[ind][buy][x]=0;
        int op1, op2, maxi=0;
        if(dp[ind][buy][x]!=-1)
            return dp[ind][buy][x];
        if(buy == 0)
        {
            op1 = f(prices,ind+1,0,x,dp);
            op2 = -prices[ind]+f(prices,ind+1,1,x,dp);
            maxi = Math.max(op1,op2);
        }
        else{
            op1=f(prices,ind+1,1,x,dp);
            op2=prices[ind]+f(prices,ind+1,0,x-1,dp);
            maxi = Math.max(op1,op2);
        }
        return dp[ind][buy][x]=maxi;
    }
}