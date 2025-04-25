class Solution {
    public char[][] rotateTheBox(char[][] boxGrid) {
        int n = boxGrid.length;
        int m = boxGrid[0].length;
        char[][] rotated = new char[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                rotated[i][j] = boxGrid[n-1-j][i];
            }
        }
        for(int j=0;j<n;j++){
            int up = m-1;
            int down = m-1;
            while(up>=0 && down>=0 && rotated[down][j]!='.'){
                up--;
                down--;
            }
            while(up>=0){
                if(rotated[up][j]=='*'){
                    down = up - 1;
                }else if(rotated[up][j]=='#'){
                    rotated[up][j] = '.';
                    rotated[down][j] = '#';
                    down--;
                }
                up--;
            }
        }
        return rotated;
    }
}