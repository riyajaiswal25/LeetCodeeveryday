class Solution {
    private int ans = Integer.MAX_VALUE;
    
    public int distributeCookies(int[] cookies, int k) {
        int[] child = new int[k];
        solve(cookies, 0, child);
        return ans;
    }

    private void solve(int[] cookies, int i, int[] child) {
        if (i == cookies.length) {
            int max = 0; // unfairness
            for (int cookie : child) {
                if (cookie == 0) return;
                max = Math.max(max, cookie);
            }
            ans = Math.min(ans, max);
        } else {
            for (int j = 0; j < child.length; j++) {
                child[j] += cookies[i];
                solve(cookies, i+1, child);
                child[j] -= cookies[i];
            }
        }
    }
}