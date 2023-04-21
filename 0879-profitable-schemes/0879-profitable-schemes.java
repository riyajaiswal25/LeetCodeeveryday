class Solution {
    int mod = 1000000007;
    public int profitableSchemes(int n, int minProfit, int[] group, int[] profit) {
        int[][][] dp=new int[profit.length+2][n+2][minProfit+2];
        for(int i=0;i<=profit.length;i++){
            for(int j=0;j<=n;j++){
                Arrays.fill(dp[i][j],-1);
            }
        }
        return sequence(minProfit,n,profit,group,0,dp);
    }
    private int sequence(int target,int member,int[] profit,int[] gp,int index,int[][][] dp){ 
        if(target<=0&&index==gp.length) return 1;
        if(index==gp.length||member==0&&target>0) return 0;
        if(dp[index][member][target]!=-1) return dp[index][member][target];
         int ans=0;
         if(member-gp[index]>=0){
          ans=sequence(Math.max(target-profit[index],0),member-gp[index],profit,gp,index+1,dp);
         } 
         ans+=sequence(target,member,profit,gp,index+1,dp);
          
         return dp[index][member][target]=ans%mod;
    }
}