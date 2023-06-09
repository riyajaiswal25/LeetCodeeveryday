class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int n = letters.length;
        int i;

        if(letters[n-1] <= target)
            return letters[0];

        for(i=n-2;i>=0;i--) {
            if(letters[i] <= target)
                break;
        }

        return letters[i+1];
    }
}