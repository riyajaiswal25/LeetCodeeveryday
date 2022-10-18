class Solution {
    boolean isOpen(char c)
    {
        return c=='('||c=='['||c=='{';
    }
    boolean matching(char a, char b)
    {
        return (a=='(' && b==')') || (a=='{' && b=='}') || (a=='[' && b==']');
    }
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(isOpen(ch)){
                stack.push(ch);
            }
            else{
                if(stack.isEmpty())
                    return false;
                else if(!matching(stack.peek(),ch))
                    return false;
                else
                    stack.pop();
            }
        }
        return stack.isEmpty();
    }
}