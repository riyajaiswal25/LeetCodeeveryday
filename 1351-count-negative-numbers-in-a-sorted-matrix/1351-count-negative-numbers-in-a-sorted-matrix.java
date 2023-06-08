class Solution {
    public int countNegatives(int[][] grid) {
        int negatives=0,n=grid[0].length;
        for(int i[]:grid)   negatives+=n-get_ans(i,n);
        return negatives;
    }
    private int get_ans(int []a,int n){
        int l=0,h=n-1;
        while(l<=h){
            int m=(l+h)/2;
            if(a[m]<0)  h=m-1;
            else    l=m+1;
        }
        return l;
    }
}