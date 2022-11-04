class Solution {
    boolean isVowel(char ch)
    {
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
            return true;
        return false;
    }
    public String reverseVowels(String s) {
        List<Integer> vowel = new ArrayList<Integer>();
        char[] chr=s.toCharArray();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(isVowel(ch)==true)
                vowel.add(i);
        }
        int n=vowel.size();
        for(int i=0;i<n/2;i++)
        {
            char temp=chr[vowel.get(i)];
            chr[vowel.get(i)]=chr[vowel.get(n-i-1)];
            chr[vowel.get(n-i-1)]=temp;
        }
        
        String st="";
        for(int i=0;i<chr.length;i++)
            st=st+chr[i];
        return st;
    }
}