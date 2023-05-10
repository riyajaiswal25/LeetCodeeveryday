class Solution {
    public int countGoodSubstrings(String s) {
        if(s.length()<3)
            return 0;
        int c=0;
        int[] freq=new int[26];
        for(int i=0;i<3;i++)
            freq[s.charAt(i)-'a']++;
        if(freq[s.charAt(0)-'a']==1 && freq[s.charAt(1)-'a']==1 && freq[s.charAt(2)-'a']==1)
            c++;
        for(int i=2;i<s.length()-1;i++)
        {
            freq[s.charAt(i-2)-'a']--;
            freq[s.charAt(i+1)-'a']++;
            if(freq[s.charAt(i-1)-'a']==1 && freq[s.charAt(i)-'a']==1 && freq[s.charAt(i+1)-'a']==1)
                c++;
        }
        return c;
    }
}


      