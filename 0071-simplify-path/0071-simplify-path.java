class Solution {
    public String simplifyPath(String path) {
        if(path.equals("/") || path.length()==1)
            return "/";
        StringBuilder sb=new StringBuilder();
        String arr[]=path.split("/");
        Stack<String> st=new Stack<>();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i].equals(".."))
            {
                if(!st.isEmpty())
                    st.pop();
            }
            else{
                if(arr[i].equals(".") || arr[i].equals(""))
                    continue;
                st.push(arr[i]);
            }
        }
        while(!st.isEmpty())
        {
            String el=st.pop();
            sb.insert(0,"/"+el);
        }
        if(sb.length()==0)
            sb.append("/");
        return sb.toString();
    }
}