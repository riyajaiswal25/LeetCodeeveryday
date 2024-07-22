class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer, String> map = new HashMap<>();
        for(int i=0;i<heights.length;i++)
            map.put(heights[i],names[i]);
        Arrays.sort(heights);
        String[] ans = new String[heights.length];
        for(int i=0;i<heights.length;i++)
        {
            ans[i]=map.get(heights[heights.length-i-1]);
        }
        return ans;
    }
}