class Solution {
    public int compress(char[] chars) {
        String s="";
        int c=1;
        for(int i=0;i<chars.length-1;i++)
        {
            if(chars[i]==chars[i+1])
                c++;
            else
            {
                if(c>1)
                {
                    s+=chars[i];
                    s+=c;
                }
                else
                {
                    s+=chars[i];
                }
                c=1;
            }
        }
        s+=chars[chars.length-1];
        if(c>1)
            s+=c;
        int k=s.length();
        for(int i=0;i<k;i++)
            chars[i]=s.charAt(i);
        return k;
    }
}