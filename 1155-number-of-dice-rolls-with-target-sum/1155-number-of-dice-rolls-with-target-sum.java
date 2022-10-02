class Solution {
    
    public int helper(int n, int k, int target, Integer[][] dp)
    {
        if (n <= 0){
            if (target == 0) return 1;
            else return 0;
        }
        if (target <= 0) return 0;
        
        if (dp[n][target] != null)
            return dp[n][target];
        
        long ans = 0;
        for (int i=1; i<=k && i<=target; i++)
        {
            ans += helper(n-1, k, target-i, dp)%1000000007;
        }
        return dp[n][target] = (int)(ans%1000000007);
    }
    
    public int numRollsToTarget(int n, int k, int target) {
        
        Integer[][] dp = new Integer[n+1][target+1];
        return helper(n, k, target, dp);
        
    }
}