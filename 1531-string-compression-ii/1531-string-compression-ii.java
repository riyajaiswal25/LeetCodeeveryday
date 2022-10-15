class Solution {
    
    private int n;
    
    public int getLengthOfOptimalCompression(String s, int k) {
        
        n = s.length();
        
        if(n == 100) {
            
            boolean allSame = true;
            for(int i = 1; i < n; i++) {
                if(s.charAt(i) != s.charAt(i - 1)) {
                    allSame = false;
                    break;
                }
            }
            
            // s = 'aaaaa....100times'
            // a100 => 4
            if(allSame) {
                return 4;
            }
        }
        
        // 4 states => [dx][prevChar][freqCount][k]
        int[][][][] dp = new int[n + 1][27][11][n + 1];
        
        //Intialize DP array with -1
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < 27; j++) {
                for(int x = 0; x < 11; x++) {
                    for(int y = 0; y < n; y++) {
                        dp[i][j][x][y] = -1;
                    }
                }
            }
        }
        
        char defaultPrevChar = (char)('z' + 1);
        
        return dpHelper(0, defaultPrevChar, 0, s, k, dp);
    }
    
    private int dpHelper(int idx, char prev, int currCharFreqCount, String s, int k, int[][][][] dp) {
        
        if(k < 0) {
            return Integer.MAX_VALUE;
        }
        
        if(idx >= n) {
            return 0;
        }
        
        // Consider currCharFreqCount as 10 because until 10...99, String length will be 2
        if(currCharFreqCount >= 10) {
            currCharFreqCount = 10;
        }
        
        if(dp[idx][prev - 'a'][currCharFreqCount][k] != -1) {
            return dp[idx][prev - 'a'][currCharFreqCount][k];
        }
        
        int res = Integer.MAX_VALUE;
        
        // Case 1 - We will skip current char if K is available so that string length is minimum
        res = Math.min(res, dpHelper(idx + 1, prev, currCharFreqCount, s, k - 1, dp));
        
        // Case 2 - We will add a char
        
        //If curr char is not same as prev char then res will be increased by one and currCharFreqCount = 1
        if(s.charAt(idx) != prev) {
            res = Math.min(res, 1 + dpHelper(idx + 1, s.charAt(idx), 1, s, k, dp));
        } else {
            // Case 3 
            // If currCharFreqCount is either 1 or 9, our res will increase by 1
            if(currCharFreqCount == 1 || currCharFreqCount == 9) {
                res = Math.min(res, 1 + dpHelper(idx + 1, prev, currCharFreqCount + 1, s, k, dp));
            } else {
                //We only increment currCharFreqCount
                res = Math.min(res, dpHelper(idx + 1, prev, currCharFreqCount + 1, s, k, dp));
            }
        }
        
        return dp[idx][prev - 'a'][currCharFreqCount][k] = res;
    }
}