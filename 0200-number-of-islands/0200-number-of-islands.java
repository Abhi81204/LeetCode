class Solution {
    public int numIslands(char[][] grid) {
        if(grid==null || grid.length == 0) return 0;
        int numOfIslands = 0;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j]=='1'){
                    numOfIslands++;
                    backtrack(grid, i, j);
                }
            }
        }
        return numOfIslands;
    }
    public void backtrack(char grid[][], int i, int j){
        if((i<0 || i>=grid.length) || (j<0 || j>=grid[0].length) || grid[i][j]!='1') return;
        grid[i][j]='0';
        backtrack(grid, i, j+1);
        backtrack(grid, i, j-1);
        backtrack(grid, i+1, j);
        backtrack(grid, i-1, j);
    }
}
    
