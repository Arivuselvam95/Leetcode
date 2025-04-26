class Solution {
    public int findMaxFish(int[][] grid) {
        int count = 0;
        for(int i =0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]!=0){
                    int n[] = new int[1];
                    countFish(grid,i,j,n);
                    count = Math.max(count,n[0]);
                }
            }
        }
        return count;
    }
    public static void countFish(int[][] grid,int i, int j, int[] count){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j]==0)
            return;
        
        count[0]+=grid[i][j];
        grid[i][j]=0;
        countFish(grid,i+1,j,count);
        countFish(grid,i-1,j,count);
        countFish(grid,i,j+1,count);
        countFish(grid,i,j-1,count);
    }
}