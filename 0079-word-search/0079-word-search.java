class Solution {
    public boolean exist(char[][] board, String word) {
        int row = board.length;
        int col = board[0].length;
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(board[i][j]== word.charAt(0)) {
                    boolean res = search(board, word, i, j, 0);
                    if(res) return true;
                }
            }
        }
        return false;
    }
    public static boolean search(char[][] board, String word, int i, int j, int k){
        if(k==word.length()) return true;
        if(i<0 || i>=board.length || j<0 || j>=board[0].length || board[i][j]!=word.charAt(k)) return false;
        char temp = board[i][j];
        board[i][j] = '#';
        if(search(board, word, i+1, j, k+1) ||
           search(board, word, i-1, j, k+1) ||
           search(board, word, i, j+1, k+1) ||
           search(board, word, i, j-1, k+1)){
            board[i][j] = temp;
            return true;
           } 
        board[i][j] = temp;
        return false;
    }
}