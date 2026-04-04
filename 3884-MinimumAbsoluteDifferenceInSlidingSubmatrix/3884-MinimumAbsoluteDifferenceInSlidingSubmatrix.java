// Last updated: 04/04/2026, 23:28:48
class Solution {
    public int[][] minAbsDiff(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] ans = new int[m-k+1][n-k+1];
        int[] window = new int[k * k];
        for (int i = 0; i <= m-k; i++) {
            for (int j = 0; j <= n-k; j++) {
                int index = 0;
                for (int r = 0; r<k; r++) {
                    for (int c = 0; c<k; c++) {
                        window[index++] = grid[i+r][j+c];
                    }
                }
                Arrays.sort(window);
                int minDiff = Integer.MAX_VALUE;
                boolean found = false;

                for (int p = 0; p<window.length-1; p++) {
                    if (window[p] != window[p+1]) {
                        int diff = window[p+1] -window[p];
                        if (diff<minDiff) {
                            minDiff = diff;
                            found = true;
                        }
                    }
                }

                ans[i][j] = found ? minDiff : 0;
            }
        }
        return ans;
    }
}