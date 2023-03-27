class Solution {
    public int minPathSum(int[][] grid) {
        for(int r=0;r<grid.length;r++){
            for(int c=0;c<grid[0].length;c++){
                if(r==0 && c==0)                    //skip the initial point (0,0)
                    continue;
                if(r==0)                            //first row elements: possible only through the previous column(c-1)
                    grid[r][c]+= grid[r][c-1];
                else if(c==0)                       //first column elements: possible only through the previous row(r-1)
                    grid[r][c]+= grid[r-1][c];
                else{
                    grid[r][c]+= Math.min(grid[r-1][c], grid[r][c-1]);      //add the min of the left and upper value, to find min cost
                }
            }
        }
        return grid[grid.length-1][grid[0].length-1];       //ans is the last element: minimized cost
    }
}