class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        List<List<Integer>> res=new ArrayList<>();
        for(int i=0;i<groupSizes.length;i++)
        {
            int person=i;
            int gs=groupSizes[i];
            List<Integer> group = map.getOrDefault(gs, new ArrayList());
            group.add(person);
            map.put(gs,group);
            if(group.size()==gs)
            {
                res.add(group);
                map.remove(gs);
            }
        }
        return res;
    }
}