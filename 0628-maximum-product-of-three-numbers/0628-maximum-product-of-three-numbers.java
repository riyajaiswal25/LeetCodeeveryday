class Solution {
    public int maximumProduct(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        //handling negative numbers
        int neg = nums[0]*nums[1]*nums[n-1];
        int pos = nums[n-1]*nums[n-2]*nums[n-3];
        return Math.max(neg,pos);
    }
}