class Solution {
    public int countBattleships(char[][] board) {
        int result = 0;
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='X'){
                    result++;
                    removeBattleships(board,i,j);
                }
            }
        }
        return result;
    }
    public static void removeBattleships(char[][] board,int i,int j ){
        if(i>=board.length || j>=board[0].length || board[i][j]=='.')
            return;
        board[i][j]='.';
        removeBattleships(board,i+1,j);
        removeBattleships(board,i,j+1);
    }
}