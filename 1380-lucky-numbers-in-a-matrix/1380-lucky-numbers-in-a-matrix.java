class Solution {
    public boolean check(int n, int r, int c, int num, int m, int[][] matrix)
    {
        for(int j=0;j<m;j++)
            if(n>matrix[r][j])
                return false;
        for(int i=0;i<num;i++)
            if(n<matrix[i][c])
                return false;
        return true;
    }
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(check(matrix[i][j],i,j,matrix.length,matrix[0].length,matrix))
                    list.add(matrix[i][j]);
            }
        }
        return list;
    }
}