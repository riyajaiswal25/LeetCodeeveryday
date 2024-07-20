class Solution {
    public void gameOfLife(int[][] board) {
        int[][] cloneBoard = new int[board.length][board[0].length];
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length;j++){
                cloneBoard[i][j]=board[i][j];
            }
        }
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length;j++){
                    board[i][j]=check(cloneBoard,i,j);
            }
        }
    }
    private int check(int[][] cloneBoard, int i, int j){
        int status=cloneBoard[i][j];
        int cnt=0;
        //check up
        if(i!=0 && cloneBoard[i-1][j]==1)
            cnt++;
        //check down
        if(i!=cloneBoard.length-1 && cloneBoard[i+1][j]==1)
            cnt++;
        //check right
        if(j!=cloneBoard[0].length-1 && cloneBoard[i][j+1]==1)
            cnt++;
        //check left
        if(j!=0 && cloneBoard[i][j-1]==1)
            cnt++;
        //check left up diagonal
        if((i!=0&&j!=0)&&cloneBoard[i-1][j-1]==1)
            cnt++;
        //check right up diagonal
        if((i!=0&&j!=cloneBoard[0].length-1)&&cloneBoard[i-1][j+1]==1)
            cnt++;
          //check left down diagonal
        if((i!=cloneBoard.length-1&&j!=0)&&cloneBoard[i+1][j-1]==1)
            cnt++;
          //check right down diagonal
        if((i!=cloneBoard.length-1&&j!=cloneBoard[0].length-1)&&cloneBoard[i+1][j+1]==1)
            cnt++;
        
        if(status == 1){
            if(cnt<2 && cnt>3)
                return 0;
            if(cnt==2 || cnt==3)
                return 1;
        }
        if(status == 0)
        {
            if(cnt==3)
                return 1;
        }
        return 0;
    }
}