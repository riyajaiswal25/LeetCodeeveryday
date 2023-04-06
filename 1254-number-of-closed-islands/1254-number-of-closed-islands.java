class Solution {
    static void dfs(int i,int j,int n,int m,int[][] tem,int[][] visited){
        visited[i][j]=1;
        // tem[i][j]=1;
        int[][] moves = {{0,-1},{0,1},{-1,0},{1,0}};
        for(int[] move : moves){
            int row = i + move[0];
            int col = j + move[1];
            if(row>=0 && row<n && col>=0 && col<m){
                if(tem[row][col]==0 && visited[row][col]==0){
                    dfs(row,col,n,m,tem,visited);
                }
            }
        }
    }
    public int closedIsland(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] tem = new int[n][m];
        int[][] visited = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                tem[i][j]=grid[i][j];
            }
        }

        //Boundry Traversal
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if((i*j==0 || i==n-1 || j==m-1) &&(tem[i][j]==0 && visited[i][j]==0)){
                    dfs(i,j,n,m,tem,visited);
                }
            }
        }

        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(tem[i][j]==0 && visited[i][j]==0){
                    count++;
                    dfs(i,j,n,m,tem,visited);
                }
            }
        }
        return count;
    }
}