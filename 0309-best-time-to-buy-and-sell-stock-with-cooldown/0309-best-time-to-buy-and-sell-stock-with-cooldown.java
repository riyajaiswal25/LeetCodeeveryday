class Solution {
    public int maxProfit(int[] prices) {
         int n = prices.length;
        if(n == 1)
            return 0;
        //solve for the last 2 days manually
        int op1 = Math.max(prices[n - 1], prices[n - 2]), up2 = 0, up1 = Math.max(0, prices[n - 1] - prices[n - 2]);
        //solve for each day until day 0 is reached
        for(int day = n - 3; day >= 0; day--) {
            //calculate today
            int op0 =Math.max(prices[day] + up2, op1);
            int up0 = Math.max(op1 - prices[day], up1);
            //remember today and forget yesterday
            up2 = up1;
            up1 = up0;
            op1 = op0;
        }
        //final value of up1 is the maximum profit when the stock is unowned on day 0
        return up1;       

    }
}