class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st=new Stack<Character>();
        for(char a:s.toCharArray())
        {
            if(!st.isEmpty() && a==st.peek())
            {
                st.pop();
            }
            else{
                st.push(a);
            }
        }
        StringBuilder res=new StringBuilder("");
        for(char i:st)
        {
            res.append(i);
        }
        return res.toString();
    }
}