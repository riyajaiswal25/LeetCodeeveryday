class Solution {
    int[][] directions={{-1,0},{0,1},{1,0},{0,-1}};
    public int countPaths(int[][] grid) {
        int res=0;
        int[][] dp=new int[grid.length][grid[0].length];
        for(int[] row:dp) Arrays.fill(row,-1);
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                res+=f(grid,i,j,dp);
                res%=(int)(1e9+7);
            }
        }
        return res;
    }
    public int f(int[][] grid, int i, int j, int[][] dp){
        if(dp[i][j]!=-1) return dp[i][j];
        int ans=1;
        for(int[] dir:directions){
            int ni=i+dir[0]; int nj=j+dir[1];
            if(ni>=0 && ni<grid.length && nj>=0 && nj<grid[0].length && grid[ni][nj]>grid[i][j]){
                ans+=f(grid,ni,nj,dp);
                ans%=(int)(1e9+7);
            }
        }
        return dp[i][j]=ans;
    }
}