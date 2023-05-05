class Solution {
    public boolean isVowel(char ch)
    {
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' ||ch=='U'){
            return true;
        } 
        return false;
    }
    public int maxVowels(String s, int k) {
        int n=s.length();
        int vow=0;
        for(int i=0;i<k;i++)
        {
            if(isVowel(s.charAt(i)))
                vow++;
        }
        if(k==n)
            return vow;
        int temp=vow;
        int st=0;
        for(int i=k;i<n;i++)
        {
            if(isVowel(s.charAt(st)))
                temp--;
            if(isVowel(s.charAt(i)))
                temp++;
            st++;
            vow=Math.max(vow,temp);
        }
        return vow;
    }
}