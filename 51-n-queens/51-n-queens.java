class Solution {
    List<List<String>> res;
    public List<List<String>> solveNQueens(int n) {
        res = new ArrayList<>();
        char[][] board = new char[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                board[i][j]='.';
            }
        }
        List<int[]> q = new ArrayList<>();
        dfs(board, 0, q);
        return res;
    }
    private void dfs(char[][] board, int r, List<int[]> q)
    {
        if(q.size() == board.length)
        {
            List<String> rows = new ArrayList<>();
            for(char[] row:board)
            {
                rows.add(new String(row));
            }
            res.add(rows);
        }
        for(int c=0;c<board.length;c++)
        {
            if(canAddQueen(r, c, q))
            {
                board[r][c]='Q';
                q.add(new int[]{r,c});
                dfs(board, r+1, q);
                board[r][c]='.';
                q.remove(q.size()-1);
                    
            }
        }
    }
    private boolean canAddQueen(int r, int c, List<int[]> q)
    {
        for(int[] i:q)
        {
            int dx = Math.abs(r-i[0]);
            int dy = Math.abs(c-i[1]);
            if(dx==0 || dy==0 || dx==dy)
                return false;
        }
        return true;
    }
}