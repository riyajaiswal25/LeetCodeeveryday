class Solution {
    public int maxi(int[] arr)
    {
        int x=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>x)
                x=arr[i];
        }
        return x;
    }
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxm = maxi(candies);
        List<Boolean> list = new ArrayList<Boolean>();
        for(int i=0;i<candies.length;i++)
        {
            if(candies[i]+extraCandies>=maxm)
                list.add(true);
            else
                list.add(false);
        }
        return list;
    }
}