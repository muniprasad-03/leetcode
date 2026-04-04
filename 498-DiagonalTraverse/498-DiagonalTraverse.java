// Last updated: 04/04/2026, 23:34:10
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[] ans = new int[m*n];
        int row = 0;
        int col = 0;
        boolean goingUp = true;
        for(int i=0;i<m*n;i++) {
            ans[i] = mat[row][col];
            if (goingUp) {
                if (col == n - 1) {
                    row++;
                    goingUp = false;
                }
                else if (row == 0) {
                    col++;
                    goingUp = false;
                } else {
                    row--;
                    col++;
                }
            } else {
                if (row == m - 1) {
                    col++;
                    goingUp = true;
                }
                else if (col == 0) {
                    row++;
                    goingUp = true;
                } else {
                    row++;
                    col--;
                }
            }
        }
        return ans;
    }
}