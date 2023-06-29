class Solution {
  private static final int[][] DIRECTIONS = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

    public int shortestPathAllKeys(String[] grid) {
        int m = grid.length;
        int n = grid[0].length();
        int target = 0;
        int startRow = 0;
        int startCol = 0;

        // Find the starting position and collect the target state
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                char c = grid[i].charAt(j);
                if (c == '@') {
                    startRow = i;
                    startCol = j;
                } else if (c >= 'a' && c <= 'f') {
                    target |= 1 << (c - 'a');
                }
            }
        }

        // Perform BFS
        ArrayDeque<int[]> queue = new ArrayDeque<>();
        int[][][] visited = new int[m][n][1 << 6];
        queue.offer(new int[]{startRow, startCol, 0, 0}); // row, col, state (keys bitmask), steps
        visited[startRow][startCol][0] = 1;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int row = current[0];
            int col = current[1];
            int state = current[2];
            int steps = current[3];

            // Check if the target state is reached
            if (state == target) {
                return steps;
            }

            // Explore four directions
            for (int[] dir : DIRECTIONS) {
                int newRow = row + dir[0];
                int newCol = col + dir[1];

                // Check if the new position is within the grid boundaries
                if (newRow >= 0 && newRow < m && newCol >= 0 && newCol < n) {
                    char c = grid[newRow].charAt(newCol);

                    // Skip the position if it is a wall ('#') or already visited
                    if (c != '#' && visited[newRow][newCol][state] == 0) {
                        // Update the state if a new key is found
                        int newState = state;
                        if (c >= 'a' && c <= 'f') {
                            newState |= 1 << (c - 'a');
                        }

                        // Skip the position if a lock is found but the corresponding key is not collected
                        if (c >= 'A' && c <= 'F' && (state & (1 << (c - 'A'))) == 0) {
                            continue;
                        }

                        // Add the new position to the queue and mark it as visited
                        queue.offer(new int[]{newRow, newCol, newState, steps + 1});
                        visited[newRow][newCol][state] = 1;
                    }
                }
            }
        }

        // If the target state is not reached, return -1 (impossible)
        return -1;
    }
}