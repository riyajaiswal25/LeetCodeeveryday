
        class Solution {
    final int MOD = (int) (1e9 + 7);
    Integer dp[];

    public int numberOfArrays(String s, int k) {
        dp = new Integer[s.length() + 1];

        return countWays(s, k, 0);
    }

    private int countWays(String str, int max, int idx) {
        if (idx == str.length()) {
            return 1;
        }

        if (dp[idx] != null) {
            return dp[idx];
        }

        if (str.charAt(idx) == '0') {
            return 0;
        }

        int count = 0;

        for (int i = idx; i < str.length(); i++) {
            String num = str.substring(idx, i + 1);

            // System.out.println(num);

            if (Long.parseLong(num) > max) {
                break;
            } 

            count += countWays(str, max, i + 1);
            count %= MOD;
        }

        return dp[idx] = count;
    }
}
    