class Solution {
    public int maxProfit(int[] prices, int fee) {
        int buy = Integer.MIN_VALUE;
        int sell = 0;

        for(int p : prices) {
            buy = Math.max(buy, sell - p);
            sell = Math.max(sell, buy + p - fee);
        }
        return sell;
    }
}