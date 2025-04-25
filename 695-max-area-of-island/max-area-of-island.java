class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int result = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int ans[] = new int[1];
                if(grid[i][j]==1){
                    findArea(grid,i,j,ans);
                    result = Math.max(result,ans[0]);
                }
            }
        }
        return result;
    }
    public static void findArea(int[][] grid,int i,int j, int[] ans){
        if(i<0 || j<0 || i>=grid.length || j>= grid[0].length || grid[i][j] == 0)
            return;
        
        ans[0]++;
        grid[i][j]=0;
        findArea(grid,i+1,j,ans);
        findArea(grid,i-1,j,ans);
        findArea(grid,i,j+1,ans);
        findArea(grid,i,j-1,ans);
    }
}