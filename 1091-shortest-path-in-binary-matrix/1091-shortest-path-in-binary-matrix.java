class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int ROW = grid.length, COL = grid[0].length;
        int[][] dirs = new int[][]{{0, 1}, {1, 1}, {1, 0}, {1, -1}, {0, -1}, {-1, -1}, {-1, 0}, {-1, 1}};

        Queue<Integer> queue = new ArrayDeque<Integer>();
        if (grid[0][0] == 0)
            queue.offer(0);
        
        while (!queue.isEmpty()) {
            int row = queue.peek() / ROW, col = queue.poll() % ROW;
            if (row == ROW - 1 && col == COL - 1)
                return grid[row][col] + 1;
            for (int i = 0, r, c; i < dirs.length; ++i)
                if ((r = row + dirs[i][0]) >= 0 && (c = col + dirs[i][1]) >= 0 && r < ROW && c < COL && grid[r][c] == 0) {
                    queue.offer(r * ROW + c);
                    grid[r][c] = grid[row][col] + 1; // save the distance and at the same time, avoid repeatedly visit the same cell
                }
        }
        return -1;    
    }
}