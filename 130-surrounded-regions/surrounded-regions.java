class Solution {
    public void solve(char[][] board){
        int n = board.length;
        if(n==0) return;
        int m = board[0].length;
        boolean visited[][] = new boolean[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i==0 || i==n-1 || j==0 || j==m-1){
                    if(board[i][j]=='O' && !visited[i][j]){
                        makeVisits(board,i,j,visited);
                    }
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(!visited[i][j]){
                    board[i][j] = 'X';
                }
            }
        }
    }
    public static void makeVisits(char[][] board,int i,int j,boolean[][] visited){
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{i,j});
        int n = board.length;
        int m = board[0].length;
        while(!queue.isEmpty()){
            int[] val = queue.poll();
            visited[val[0]][val[1]] = true;
            if(val[0]+1 < n && board[val[0]+1][val[1]]=='O' && !visited[val[0]+1][val[1]]){
                visited[val[0]+1][val[1]] = true;
                queue.add(new int[]{val[0]+1,val[1]});
            }
            if(val[0]-1 >= 0 && board[val[0]-1][val[1]]=='O' && !visited[val[0]-1][val[1]]){
                visited[val[0]-1][val[1]] = true;
                queue.add(new int[]{val[0]-1,val[1]});
            }
            if(val[1]+1 < m && board[val[0]][val[1]+1]=='O' && !visited[val[0]][val[1]+1]){
                visited[val[0]][val[1]+1] = true;
                queue.add(new int[]{val[0],val[1]+1});
            }
            if(val[1]-1 >=0 && board[val[0]][val[1]-1]=='O' && !visited[val[0]][val[1]-1]){
                visited[val[0]][val[1]-1] = true;
                queue.add(new int[]{val[0],val[1]-1});
            }
        } 
    }
}