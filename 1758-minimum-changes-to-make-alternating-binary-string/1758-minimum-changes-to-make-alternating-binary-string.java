class Solution {
    public int checkf(String s)
    {
        int c=0;
        for(int i=0;i<s.length();i++)
        {
            if(i%2==0 && s.charAt(i) != '1')
                c++;
            else if(i%2!=0 && s.charAt(i)!='0')
                c++;
        }
        return c;
    }
    public int checks(String s)
    {
        int c=0;
        for(int i=0;i<s.length();i++)
        {
            if(i%2==0 && s.charAt(i) != '0')
                c++;
            else if(i%2!=0 && s.charAt(i)!='1')
                c++;
        }
        return c;
    }
    public int minOperations(String s) {
        int fir = checkf(s);
        int sec = checks(s);
        return (fir<sec)?fir:sec;
    }
}