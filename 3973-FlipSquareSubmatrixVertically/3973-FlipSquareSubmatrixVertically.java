// Last updated: 04/04/2026, 23:28:26
class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        if (k <= 1) return grid;
        int rowEnd = x + k - 1;
        for (int i = 0; i < k/2; i++) {
            int topRow = x + i;
            int bottomRow = rowEnd - i;
            for (int j = y; j < y + k; j++) {
                int temp = grid[topRow][j];
                grid[topRow][j] = grid[bottomRow][j];
                grid[bottomRow][j] = temp;
            }
        }
        return grid;
    }
}