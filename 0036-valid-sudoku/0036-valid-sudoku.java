class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean[][] r = new boolean[9][9];
        boolean[][] c = new boolean[9][9];
        boolean[][] s = new boolean[9][9];
        int num, k;
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                if(board[i][j] != '.'){
                    num = board[i][j] - '1';
                    k = i/3*3 + j/3;
                    if(r[i][num] || c[j][num] || s[k][num]) return false;
                    r[i][num] = c[j][num] = s[k][num] = true;
                }
            }
        }
        return true;
    }
}