class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        if(nums.length<=1)
            return false;
        Map<Integer, Integer> map=new HashMap<>();
        int sum=nums[0];
        map.put(sum%k,0);
        for(int i=1;i<nums.length;i++)
        {
            sum+=nums[i];
            if(sum%k==0)
                return true;
            else if(map.containsKey(sum%k)){
                if(i-map.get(sum%k)>=2)
                    return true;
                }
            else
                    map.put(sum%k,i);
        }
        return false;
    }
}