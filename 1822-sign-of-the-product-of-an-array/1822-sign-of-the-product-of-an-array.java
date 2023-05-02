class Solution {
    public int arraySign(int[] nums) {
        int p=1;
        for(int i:nums)
        {
            if(i<0)
                p*=-1;
            else if(i>0)
                p*=1;
            else
                return 0;
        }
            
        if(p<0)
            return -1;
        else if(p>0)
            return 1;
        else
            return 0;
    }
}