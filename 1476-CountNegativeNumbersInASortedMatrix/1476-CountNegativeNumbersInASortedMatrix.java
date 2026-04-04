// Last updated: 04/04/2026, 23:31:35
class Solution {
    public int countNegatives(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int ans = 0;
        int row = m-1;
        int col = 0;
        while(row>=0 && col<n) {
            if(grid[row][col] < 0) {
                ans += (n-col);
                row--;
            } else {
                col++;
            }
        }
        return ans;
    }
}