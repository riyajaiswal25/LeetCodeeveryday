class Solution {
    public int evalRPN(String[] tokens) {
        Set<String> operations=new HashSet<>(Arrays.asList("+","-","/","*"));
        Stack<Integer> stack=new Stack<>();
        for(String token:tokens)
        {
            if(!operations.contains(token))
            {
                stack.push(Integer.valueOf(token));
                continue;
            }
            int num2=stack.pop();
            int num1=stack.pop();
            if("+".equals(token))
            stack.push(num1+num2);
            else if("-".equals(token))
            stack.push(num1-num2);
            else if("*".equals(token))
            stack.push(num1*num2);
            else if("/".equals(token))
            stack.push(num1/num2);
        }
        return stack.pop();
    }
}