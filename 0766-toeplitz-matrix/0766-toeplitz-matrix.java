class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(i-1<0 || j-1<0)
                    continue;
                if(matrix[i][j] != matrix[i-1][j-1])
                    return false;
            }
        }
        return true;
    }
}