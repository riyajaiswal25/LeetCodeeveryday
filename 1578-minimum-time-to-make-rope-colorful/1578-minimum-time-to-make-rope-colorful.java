class Solution {
    public int minCost(String colors, int[] neededTime) {
         int n = colors.length();
        int ans = 0;
        for(int i=0;i<n;i++){
            int sum = 0, j = i, max = Integer.MIN_VALUE; 
            while(j<n){
                sum += neededTime[j];
                max = Math.max(max,neededTime[j]);
                if(j+1<n && colors.charAt(j+1)!=colors.charAt(j)){      
                    break;
                }
                j++;
            }
            ans += sum - max;
            i = j;
        }
        return ans;
    }
}