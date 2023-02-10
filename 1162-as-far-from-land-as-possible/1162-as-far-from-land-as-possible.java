class Solution {
    public int maxDistance(int[][] grid) {
        int n = grid.length, answer = 0;
        final int infinity = 2 * n + 1;     // max. manhattan distance for this n x n grid, plus 1
        final int land = 1;

        // Pass 1: Go to all grid cells once, and mark each "no land" cell with land (!)
        // distance relative to it's west and north neighbors. Original "land" cells remain untouched.
        // Be aware that distances are 1-originated. I.e. a "land" cell has to itself distance 1.
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if (grid[row][col] != land) {
                    grid[row][col] = infinity;
                    if (row > 0) grid[row][col] = Math.min(grid[row][col], grid[row - 1][col] + 1);
                    if (col > 0) grid[row][col] = Math.min(grid[row][col], grid[row][col - 1] + 1);
                }
            }
        }

        n -= 1;     // All following calculations are about a cell and its south or east neighbor.
        // Pass 2: find the maximum distance in the grid, among all cells that are not "land".
        for (int row = n; row >= 0; row--) {
            for (int col = n; col >= 0; col--) {
                if (grid[row][col] != land) {
                    if (row < n) grid[row][col] = Math.min(grid[row][col], grid[row + 1][col] + 1);
                    if (col < n) grid[row][col] = Math.min(grid[row][col], grid[row][col + 1] + 1);
                    answer = Math.max(answer, grid[row][col]);
                }
            }
        }

        // Obey the off by one due to the 1-origin of distances in the two passes.
        // Because "land" cells are ignored, answer will remain 0 in a "no water" grid.
        // Because "water" cells get initialized with "infinity" in pass 1, if there is
        // no "land" in the grid, answer will be "infinity".
        return answer == infinity ? -1 : answer - 1;
    }
}