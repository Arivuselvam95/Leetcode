class Solution {
    public int numEnclaves(int[][] grid) {
        int count = 0;
        for(int i =0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    int n[] = new int[1];
                    countEnclaves(grid,i,j,n);
                    if(n[0]>0)
                        count+=n[0];
                }
            }
        }
        return count;
    }
    public static void countEnclaves(int[][] grid,int i, int j, int[] n){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length){
            n[0] = Integer.MIN_VALUE;
            return;
        }
        if(grid[i][j]==0)
            return;

        n[0]++;
        grid[i][j]=0;
        countEnclaves(grid,i+1,j,n);
        countEnclaves(grid,i-1,j,n);
        countEnclaves(grid,i,j+1,n);
        countEnclaves(grid,i,j-1,n);
    }
}