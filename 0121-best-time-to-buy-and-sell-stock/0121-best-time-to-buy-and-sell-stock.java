class Solution {
    public int maxProfit(int[] prices) {
        int mini=prices[0];
        int pro=0;
        int cost = 0;
        for(int i=1;i<prices.length;i++)
        {
            cost = prices[i]-mini;
            pro = Math.max(pro,cost);
            mini = Math.min(mini,prices[i]);
        }
        return pro;
    }
}