class Solution {
    public static boolean isValid(int i,int j,int n,int m){
        return i>=0 && i<n && j>=0 && j<m;
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc]==color) return image;
        int n = image.length;
        int m = image[0].length;
        int[][] dir = {{0,-1},{0,1},{-1,0},{1,0}};
        Queue<int[]> queue = new LinkedList<>();  
        queue.add(new int[]{sr,sc});
        int old = image[sr][sc];
        while(!queue.isEmpty()){
            int[] pos = queue.poll();
            image[pos[0]][pos[1]]=color;
            for(int[] d : dir){
                if(isValid(pos[0]+d[0],pos[1]+d[1],n,m) && image[pos[0]+d[0]][pos[1]+d[1]]==old){
                    queue.add(new int[]{pos[0]+d[0],pos[1]+d[1]});
                }
            }
        }
        return image;
    }
}