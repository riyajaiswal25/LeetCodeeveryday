class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        return Math.max(maxCons(answerKey, k, 'T'),maxCons(answerKey, k, 'F'));
    }
    private int maxCons(String s, int k, char c){
        int res = 0, cur = 0;
        for(int i=0, j=0; i<s.length(); i++){
            if(s.charAt(i) == c)
                cur++;
            while(cur > k)
                if(s.charAt(j++) == c)
                    cur--;
            res = Math.max(res, i-j+1);
        }
        return res;
    }
}