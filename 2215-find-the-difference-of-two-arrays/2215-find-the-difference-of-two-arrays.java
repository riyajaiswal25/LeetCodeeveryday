class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> res1=new ArrayList<>();
        List<Integer> res2=new ArrayList<>();
        Set<Integer> set1=new HashSet<>();
        Set<Integer> set2=new HashSet<>();
        
        for(int i:nums1)
            set1.add(i);
        for(int i:nums2)
            set2.add(i);
        
        for(int i:set1)
        {
            if(!set2.contains(i))
                res1.add(i);
        }
        for(int i:set2)
        {
            if(!set1.contains(i))
                res2.add(i);
        }
        res.add(res1);
        res.add(res2);
        return res;
    }
}