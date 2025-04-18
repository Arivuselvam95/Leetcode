class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = 0;
        int col = 0;
        int m = matrix.length;
        int n = matrix[0].length;
        while(col+1 < n && matrix[0][col+1] <= target) col++;
        while(row+1 < m && matrix[row+1][0] <= target) row++;
        for(int i = 0;i<=row;i++) 
            for(int j = 0;j<=col;j++) 
                if(matrix[i][j]==target)
                    return true;
        return false;
    }
}