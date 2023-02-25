class Solution {
    public int maxProfit(int[] prices) {
        int pr=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++)
        {
            min=Math.min(min, prices[i]);
            pr=Math.max(pr, prices[i]-min);
        }
        return pr;
    }
}