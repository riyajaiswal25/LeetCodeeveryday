class Solution {
    public int maxProfit(int[] prices) {
        int minm = prices[0];
        int pro = 0;
        int cost = 0;
        for(int i=1;i<prices.length;i++)
        {
            cost = prices[i]-minm;
            pro = Math.max(pro,cost);
            minm = Math.min(minm,prices[i]);
        }
        return pro;
    }
}