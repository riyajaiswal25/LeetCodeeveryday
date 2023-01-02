class Solution {
    private boolean checkuppercase(String str)
    {
        for(int i=1;i<str.length();i++)
        {
            if(Character.isUpperCase(str.charAt(i))==false)
                return false;
        }
        return true;
    }
     private boolean checklowercase(String str)
    {
        for(int i=1;i<str.length();i++)
        {
            if(Character.isLowerCase(str.charAt(i))==false)
                return false;
        }
         return true;
     } 
    public boolean detectCapitalUse(String word) {
        char ch=word.charAt(0);
        if(Character.isUpperCase(ch))
        {
            if(checkuppercase(word)||checklowercase(word))
                return true;
            else
                return false;
        }
       
        else{
            if(checklowercase(word))
                return true;
            else
                return false;
        }
    }
}