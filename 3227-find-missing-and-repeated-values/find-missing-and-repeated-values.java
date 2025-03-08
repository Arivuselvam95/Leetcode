class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int a=-1,b=-1;
        boolean[] arr = new boolean[n*n+1];
        for(int[] g : grid)
            for(int i : g){
                if(arr[i])
                    a = i;
                arr[i] = true;
            }
        for(int i=1;i<=n*n;i++)
            if(!arr[i])
                b = i;
        return new int[]{a,b};
    }
}