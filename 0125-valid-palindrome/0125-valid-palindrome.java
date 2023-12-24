class Solution {
    public boolean isPalindrome(String s) {
        if(s==" "||s=="")
            return true;
        s = s.toLowerCase();
        String str="";
        for(int i=0;i<s.length();i++)
        {
            if(Character.isLetterOrDigit(s.charAt(i)))
                str+=s.charAt(i);
        }
        int n=str.length();
        for(int i=0;i<n/2;i++)
        {
            if(str.charAt(i)!=str.charAt(n-i-1))
                return false;
        }
        return true;
    }
}