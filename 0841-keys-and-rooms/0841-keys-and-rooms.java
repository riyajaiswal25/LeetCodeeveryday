class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        
        boolean[] vis=new boolean[rooms.size()];
        vis[0]=true;
        Stack<Integer> st=new Stack<>();
        st.push(0);
        int c=1;
        while(st.size()>0)
            for(int k:rooms.get(st.pop()))
                if(!vis[k])
                {
                    st.push(k);
                    vis[k]=true;
                    c++;
                }
        return rooms.size()==c;
    }
}