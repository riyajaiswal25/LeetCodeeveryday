class Solution {
    public int minimizeArrayValue(int[] nums) {
         long result = 0; //final ans
    long total = 0; //to store values iteratively in form of subproblem
    for(int i=0; i<nums.length; i++){
        total += nums[i]; //[0], [0,1], [0,1,2] and so on.
        result = Math.max(result, (total + i) / ( i+1 )); //total of index[0,1] will be (total+1) / 1+1;
    }
    return (int)result;
    }
}