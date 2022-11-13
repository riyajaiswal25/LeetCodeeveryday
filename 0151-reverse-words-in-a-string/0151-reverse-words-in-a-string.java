class Solution {
    public String reverseWords(String s) {
        Stack<String> st=new Stack<>();
        int n=s.length();
        String[] str=s.split(" ");
        
        for(String word:str)
        {
            if(word.equals(" ")||word.length()<1)
                continue;
            st.push(word);
        }
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty())
        {
            sb.append(st.pop());
            sb.append(" ");
        }
        return sb.substring(0,sb.length()-1).toString();
    }
}