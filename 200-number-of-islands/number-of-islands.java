class Solution {
    public int numIslands(char[][] grid) {
        int n = grid.length;
        if(n==0) return 0;
        int m = grid[0].length;
        int count = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]=='1'){
                    count++;
                    makeIslandZero(grid,i,j,n,m);
                }
            }
        }
        return count;
    }
    public static void makeIslandZero(char[][] grid,int i,int j,int n,int m){
        if(!(i>=0 && i<n && j>=0 && j<m ) || grid[i][j]=='0') return;
        grid[i][j] = '0';
        makeIslandZero(grid,i+1,j,n,m);
        makeIslandZero(grid,i-1,j,n,m);
        makeIslandZero(grid,i,j+1,n,m);
        makeIslandZero(grid,i,j-1,n,m);
    }
}