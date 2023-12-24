class Solution {
    public int removeElement(int[] nums, int val) {
        int x=0 ,y=0;
        while(y<nums.length)
        {
            if(nums[y]!=val)
            {
                int temp=nums[x];
                nums[x]=nums[y];
                nums[y]=temp;
                x++;
                
            }
            y++;
        }
        return x;
    }
}
/*int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
        }
        return i;
        */