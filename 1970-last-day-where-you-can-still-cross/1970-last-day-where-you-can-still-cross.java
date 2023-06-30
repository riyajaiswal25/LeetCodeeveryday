class Solution {

    public int[][] nthDayBoard(int[][] cells, int n, int row, int col){
        int[][] board = new int[row][col];
        for(int i = 0 ; i < n ; i++){
            board[cells[i][0]-1][cells[i][1]-1] = 1;
        }
        return board;
    }


    int[][] dirs = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
    public boolean dfs(int[][] board, int i, int j, int row, int col){
        if(i < 0 || i == row || j < 0 || j == col || board[i][j] == 1 || board[i][j] == 1000) return false;
        if(i == row-1) return true;
        int temp = board[i][j];
        board[i][j] = 1000;
        for(int[] ar : dirs){
            int nr = i+ar[0];
            int nc = j+ar[1];
            if(dfs(board, nr, nc, row, col)) return true;
        }
        return false;
    }


    public int latestDayToCross(int row, int col, int[][] cells) {
        int lo = 0;
        int hi = cells.length-1;
        int day = 0;
        while(lo <= hi){
            int mid = (lo+hi)/2;
            int[][] board = nthDayBoard(cells, mid, row, col);


            /* dfs Approach */
            boolean flag = false;
            for(int c = 0 ; c < col ; c++){
                if(board[0][c] == 0){
                    flag = dfs(board, 0, c, row, col);
                }
                if(flag) break;
            }
            if(flag){
                lo = mid+1;
                day = mid;
            }else{
                hi = mid-1;
            }
        }
        return day;
    }
}