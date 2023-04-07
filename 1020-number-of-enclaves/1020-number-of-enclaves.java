class Solution {
    public void dfs(int[][] grid , int x  , int y , int m , int n){
        if(x < 0 || y < 0 || x >= m || y >= n){
            return ;
        }
        if(grid[x][y] == 0){
           return ;
        }
        
        grid[x][y] = 0 ;
        dfs(grid , x + 1 , y,  m, n);
        dfs(grid , x-1 , y, m ,n);
        dfs(grid , x , y-1, m ,n);
        dfs(grid , x , y+1, m ,n);            

    }
    public int numEnclaves(int[][] grid) {
       int m = grid.length ;
       int n = grid[0].length ;
       for(int i =0; i < m; i++){
           if(grid[i][0] == 1){
              dfs(grid , i , 0 , m , n);
           }
           if(grid[i][n-1] ==  1){
               dfs(grid , i , n-1 , m , n);
           }
           
       }
        for(int i =0; i < n; i++){
           if(grid[0][i] == 1){
              dfs(grid , 0 , i , m , n);
           }
           if(grid[m-1][i] ==  1){
               dfs(grid , m-1 , i , m , n);
           }
           
       }

       int count =0 ;
       for(int i=0; i < m ; i++){
           for(int j =0; j < n ; j++){
               if(grid[i][j] == 1){
                   count++;
               }
           }
       }
       return count ;
       
    }
}