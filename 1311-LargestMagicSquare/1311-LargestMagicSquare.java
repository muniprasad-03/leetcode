// Last updated: 04/04/2026, 23:31:52
class Solution {
    public int largestMagicSquare(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int ans = 1;
        int end = Math.min(m, n);
        for(int k=2; k<=end; k++) {
            for(int i=0; i+k<=m; i++) {
                for(int j=0; j+k<=n; j++) {
                    if(isMagicSquare(grid, i, j, k)) {
                        ans = Math.max(ans, k);
                    }
                }
            }
        }   
        return ans;
    }
    private boolean isMagicSquare(int[][] grid, int row, int col, int order) {
        int[] rowSums = new int[order];
        int[] colSums = new int[order];
        int d1Sum = 0;
        int d2Sum = 0;
        for(int i=0;i<order;i++) {
            for(int j=0;j<order;j++) {
                int num = grid[row+i][col+j];
                rowSums[i] += num;
                colSums[j] += num;
                if(i==j) d1Sum += num;
                if(i+j == order-1) d2Sum += num;
            }
        }
        if(d1Sum != d2Sum) return false;
        for(int sum : rowSums) {
            if(d1Sum != sum) return false;
        }
        for(int sum : colSums) {
            if(d1Sum != sum) return false;
        }
        return true;
    }
}