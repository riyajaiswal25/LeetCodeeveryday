class Solution {
    public String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++)
        {
            if(checkpal(words[i])==true)
                return words[i];
        }
        return "";
    }
    public boolean checkpal(String word)
    {
        for(int i=0;i<word.length()/2;i++)
        {
            if(word.charAt(i)!=word.charAt(word.length()-i-1))
            {
                return false;
            }
        }
        return true;
    }
}