class Solution {
    public int maxProfit(int[] prices) {
        int mini=prices[0];
        int pr=0;
        int n=prices.length;
        for(int i=0;i<n;i++)
        {
            int cost=prices[i]-mini;
            pr=Math.max(pr, cost);
            mini=Math.min(mini, prices[i]);
        }
        return pr;
    }
}