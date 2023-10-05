class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int x = (int)Math.floor(nums.length/3);
        //System.out.println(x);
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        List<Integer> list = new ArrayList<Integer>();
        for(int key:map.keySet())
        {
            //System.out.println(key +" "+map.get(key));
            if(map.get(key)>x)
                list.add(key);
        }
        return list;
    }
}