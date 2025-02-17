class Solution {
    public static boolean isValid(int rowVal, int colVal, int rsize, int csize) {
        return rowVal >= 0 && rowVal < rsize && colVal >= 0 && colVal < csize;
    }
    
    class Pair {
        int row;
        int col;

        Pair(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }

    public int orangesRotting(int[][] grid) {
        int[] rOffset = {-1, 0, 1, 0};
        int[] cOffset = {0, 1, 0, -1};
        int rsize = grid.length;
        int csize = grid[0].length;
        Queue<Pair> queue = new LinkedList<>();
        boolean isFresh = false;
        
        for (int i = 0; i < rsize; i++) {
            for (int j = 0; j < csize; j++) {
                if (grid[i][j] == 1) {
                    isFresh = true;
                }
            }
        }
        
        if (!isFresh) {
            return 0;
        }
        
        int time = 0;
        for (int i = 0; i < rsize; i++) {
            for (int j = 0; j < csize; j++) {
                if (grid[i][j] == 2) {
                    queue.offer(new Pair(i, j));
                }
            }
        }
        
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Pair curr = queue.poll();
                for (int j = 0; j < 4; j++) {
                    int rowVal = curr.row + rOffset[j];
                    int colVal = curr.col + cOffset[j];
                    if (isValid(rowVal, colVal, rsize, csize) && grid[rowVal][colVal] == 1) {
                        grid[rowVal][colVal] = 2;
                        queue.offer(new Pair(rowVal, colVal));
                    }
                }
            }
            if (!queue.isEmpty()) {
                time++;
            }
        }
        
        for (int i = 0; i < rsize; i++) {
            for (int j = 0; j < csize; j++) {
                if (grid[i][j] == 1) {
                    return -1;
                }
            }
        }
        
        return time;
    }
}