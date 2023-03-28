class Solution {
    public int mincostTickets(int[] days, int[] costs) {
        int[] dp = new int[366]; // dynamic programming array
        boolean[] travelDays = new boolean[366]; // days on which we will travel
        
        for (int day : days) {
            travelDays[day] = true;
        }
        
        for (int i = 1; i <= 365; i++) {
            if (!travelDays[i]) {
                // if we're not traveling on this day, we don't need to buy a ticket
                dp[i] = dp[i-1];
                continue;
            }
            
            // if we're traveling on this day, we need to decide which ticket to buy
            dp[i] = Math.min(dp[i-1] + costs[0], dp[Math.max(0, i-7)] + costs[1]);
            dp[i] = Math.min(dp[i], dp[Math.max(0, i-30)] + costs[2]);
        }
        
        return dp[365]; // return the cost of traveling every day in the year
    }
}