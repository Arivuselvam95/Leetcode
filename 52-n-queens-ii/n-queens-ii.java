class Solution {
    public int totalNQueens(int n) {
        char arr[][] = new char[n][n];
        int[] count = new int[1];
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                arr[i][j] = '.';
        nQueen(arr,0,count);
        return count[0];
    }
    public static void nQueen(char[][] arr,int row,int[] count){
        if(row==arr.length){
            count[0]++;
            return;
        }
        for(int col=0;col<arr.length;col++){
            if(safe(arr,row,col)){
                arr[row][col] = 'Q';
                nQueen(arr,row+1,count);
                arr[row][col] = '.';
            }
        }
    }
    public static boolean safe(char[][] arr,int row,int col){
        for(int i=0;i<row;i++)
            if(arr[i][col]=='Q')
                return false;
        for(int i=1;row-i>=0 && col-i>=0;i++){
            if(arr[row-i][col-i]=='Q')
                return false;
        }
        for(int i=1;row-i>=0 && col+i<arr.length;i++){
            if(arr[row-i][col+i]=='Q')
                return false;
        }
        return true;
    }
}