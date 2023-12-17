class Solution {
    public int compress(char[] chars) {
        String s="";
        int freq=1;
        for(int i=0;i<chars.length-1;i++)
        {
            if(chars[i]==chars[i+1])
                freq++;
            else{
                if(freq>1)
                {
                    s+=chars[i];
                    s+=freq;
                }
                else
                    s+=chars[i];
                freq=1;
            }
        }
        s+=chars[chars.length-1];
        if(freq>1)
            s+=freq;
        int k=s.length();
        for(int i=0;i<k;i++)
            chars[i]=s.charAt(i);
        return k;
    }
}