
   public class Solution {
    public String reverseWords(String s) {
        String sub="";
        String ans="";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=' ')
            {
                sub=sub+s.charAt(i);
            }
            else if(s.charAt(i)==' '){
                StringBuilder str
            = new StringBuilder(sub);
                str.reverse();
                str.append(' ');
                str.toString();
                sub="";
                ans=ans+str;
            }
        }
        
        StringBuilder str
            = new StringBuilder(sub);
                str.reverse().toString();
        ans=ans+str;
        return ans;
    }
   }
