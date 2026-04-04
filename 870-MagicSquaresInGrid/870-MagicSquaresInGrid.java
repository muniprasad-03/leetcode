// Last updated: 04/04/2026, 23:32:51
class Solution {
    private boolean isMagicSquare(int[][] grid, int row, int col) {
        boolean[] seen = new boolean[10];
        for(int i=0;i<3;i++) {
            int rowSum = 0;
            for(int j=0;j<3;j++) {
                int num = grid[row+i][col+j];
                if(num<1 || num>9 || seen[num]) return false;
                seen[num] = true;
                rowSum += num;
            }
            if(rowSum != 15) return false;
        }
        for(int i=0;i<3;i++) {
            int colSum = 0;
            for(int j=0;j<3;j++) {
                int num = grid[row+j][col+i];
                colSum += num;
            }
            if(colSum != 15) return false;
        }
        int d1 = grid[row][col]+grid[row+1][col+1]+grid[row+2][col+2];
        int d2 = grid[row][col+2]+grid[row+1][col+1]+grid[row+2][col];
        return d1 == 15 && d2 == 15;
    }
    public int numMagicSquaresInside(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int ans = 0;
        for(int i=0;i<=n-3;i++) {
            for(int j=0;j<=m-3;j++) {
                if(isMagicSquare(grid,i,j)) {
                    ans++;
                }
            }
        }
        return ans;
    }
}