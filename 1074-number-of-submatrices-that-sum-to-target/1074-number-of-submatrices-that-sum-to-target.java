class Solution {
    public int numSubmatrixSumTarget(int[][] matrix, int target) {
        int m=matrix.length, n=matrix[0].length;
        for(int i=0;i<m;i++)
        {
            for(int j=1;j<n;j++)
            {
                matrix[i][j]+=matrix[i][j-1];
            }
        }
        int c=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++){
                Map<Integer, Integer> map = new HashMap<>();
                map.put(0,1);
                int sum=0;
                for(int k=0;k<m;k++){
                    sum+=matrix[k][j]-(i>0?matrix[k][i-1]:0);
                    c+=map.getOrDefault(sum-target,0);
                    map.put(sum,map.getOrDefault(sum,0)+1);
                }
            }
        }
        return c;
    }
}