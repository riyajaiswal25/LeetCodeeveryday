class Solution {
    public boolean isPalindrome(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' ')
                continue;
            if(Character.isLetterOrDigit(s.charAt(i))==true)
            {
                st.push(s.charAt(i));
            }
        }
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty())
            sb.append(st.pop());
        System.out.println(sb);
        System.out.println(sb.reverse());
        if(sb.toString().toLowerCase().equals(sb.reverse().toString().toLowerCase()))
            return true;
        else
            return false;
    }
}