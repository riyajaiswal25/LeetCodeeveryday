class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
       HashMap<Integer, Integer> map=new HashMap<>();
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> zeroL=new ArrayList<>();
        List<Integer> oneL=new ArrayList<>();
        for(int[] match:matches)
        {
            map.put(match[0],map.getOrDefault(match[0],0));
            map.put(match[1],map.getOrDefault(match[1],0)+1);
        }
        for(Map.Entry<Integer,Integer> e:map.entrySet())
        {
            if(e.getValue()==0)
                zeroL.add(e.getKey());
            if(e.getValue()==1)
                oneL.add(e.getKey());
        }
        Collections.sort(zeroL);
        Collections.sort(oneL);
        ans.add(zeroL);
        ans.add(oneL);
        return ans;
    }
}