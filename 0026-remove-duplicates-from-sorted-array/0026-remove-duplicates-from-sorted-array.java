class Solution {
    public int removeDuplicates(int[] nums) {
        Stack<Integer> st=new Stack<>();
        for(int i:nums)
        {
            if(!st.isEmpty() && i==st.peek())
            {
                continue;
            }
            else{
                st.push(i);
            }
        }
        int n=st.size();
        for(int i=0;i<n;i++)
            nums[n-i-1]=st.pop();
        return n;
    }
}