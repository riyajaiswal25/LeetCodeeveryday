class Solution {
    public int maxProfit(int[] prices, int fee) {
        if(prices.length==0)
            return 0;
        int[][] dp=new int[prices.length+1][2];
        for(int[] row:dp)
            Arrays.fill(row,-1);
        return f(prices,0,0,fee,dp);
    }
    private int f(int[] prices, int ind, int buy, int fee, int[][] dp)
    {
        if(ind == prices.length)
            return 0;
        if(dp[ind][buy]!=-1)
            return dp[ind][buy];
        int op1,op2,maxi=0;
        if(buy==0)
        {
            op1=f(prices,ind+1,0,fee,dp);
            op2=-prices[ind]+f(prices,ind+1,1,fee,dp);
            maxi = Math.max(op1,op2);
        }
        else{
            op1=f(prices,ind+1,1,fee,dp);
            op2=prices[ind]-fee+f(prices,ind+1,0,fee,dp);
            maxi=Math.max(op1,op2);
        }
        return dp[ind][buy]=maxi;
    }
}