class Solution {
    public int minOperations(int[] nums) {
        /*HashMap<Integer, Integer> map = new HashMap<>();
        int n=nums.length;
        int c=0;
        for(int i=0;i<n;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(Integer k:map.keySet())
        {
            int v=map.get(k);
            if(v==1)
                return -1;
            else if(v % 3==0)
                return c+=(v/3);
            else{
                c+=(v/3)+1;
            }
        }
        return c; */
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        int c = 0;
        for (int i = 0; i < n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        for (Integer k : map.keySet()) {
            int v = map.get(k);
            if (v == 1) {
                return -1;
            } else if (v % 3 == 0) {
                c += (v / 3);
            } else {
                c += (v / 3) + 1;
            }
        }
        return c;
    }
}