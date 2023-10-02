class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list=new ArrayList<>();
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<candies.length;i++)
        {
            if(maxi<candies[i])
            {
                maxi=candies[i];
            }
        }
        for(int i=0;i<candies.length;i++)
        {
            if(candies[i]+extraCandies >= maxi)
                list.add(true);
            else
                list.add(false);
        }
        return list;
    }
}