class Solution {
    public int minOperations(int[][] grid, int x) {
        int c=0;
        ArrayList<Integer> list = new ArrayList<>();
        int n=grid.length;
        for(int i=0;i<n;i++)
        {
            int m=grid[i].length;
            for(int j=0;j<m;j++)
            {
                list.add(grid[i][j]);
            }
        }
        Collections.sort(list);
        n=list.size();
        int med=list.get(n/2);
        for(int i=0;i<n;i++)
        {
            int d=Math.abs(med-list.get(i));
            if(d%x != 0)
                return -1;
            c+=d/x;
        }
        return c;
    }
}