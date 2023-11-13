class Solution {
    private boolean checkVowel(char ch)
    {
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E'|| ch=='I' || ch=='O' || ch=='U')
            return true;
        return false;
            
    }
    public String sortVowels(String s) {
        ArrayList<Character> arr = new ArrayList<>();
        for(int i=0;i<s.length();i++)
        {
            if(checkVowel(s.charAt(i))==true)
                arr.add(s.charAt(i));
        }
        Collections.sort(arr);
        StringBuilder sb=new StringBuilder();
        int j=0;
        for(int i=0;i<s.length();i++)
        {
            if(checkVowel(s.charAt(i))==true)
            {
                sb.append(arr.get(j++));
            }
            else{
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}