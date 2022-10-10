class Solution {
    public String breakPalindrome(String palindrome) {
        int n=palindrome.length();
        if(n<=1)
            return "";
        char ch[]=palindrome.toCharArray();
        for(int i=0;i<n/2;i++)
        {
            if(palindrome.charAt(i) != 'a')
            {
                ch[i]='a';
                 String str = String.valueOf(ch);
                return str;
            }
        }
        ch[n-1]='b';
        String str = String.valueOf(ch);
        return str;
    }
}