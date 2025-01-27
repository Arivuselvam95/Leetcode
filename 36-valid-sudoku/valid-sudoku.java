class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> filled = new HashSet<>();
        for(int i=0; i<9; i++)
            for(int j=0; j<9; j++){
                if(board[i][j]!='.'){
                    String ele = "(" + board[i][j] + ")";
                    if(!filled.add(i + ele) || !filled.add(ele + j) || !filled.add(i/3+ele+j/3))
                        return false;
                }
            }
        return true;
    }
}