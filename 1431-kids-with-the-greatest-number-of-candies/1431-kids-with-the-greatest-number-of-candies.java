class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=Integer.MIN_VALUE;
        List<Boolean> ans=new ArrayList<Boolean>();
        for(int i=0;i<candies.length;i++)
        {
            max=Math.max(max,candies[i]);
        }
        for(int i=0;i<candies.length;i++)
        {
            if(candies[i]+extraCandies>=max)
            {
                ans.add(true);
            }
            else
                ans.add(false);
        }
        return ans;
        
    }
}