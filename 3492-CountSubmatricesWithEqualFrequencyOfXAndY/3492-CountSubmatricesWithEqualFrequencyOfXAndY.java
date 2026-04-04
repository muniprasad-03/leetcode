// Last updated: 04/04/2026, 23:29:16
class Solution {
    public int val(int i, int j, char ch) {
        if(ch == 'X') return 1;
        else if(ch == 'Y') return -1;
        else return 0;
    } 

    public int numberOfSubmatrices(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] prefix = new int[m][n];
        boolean[][] hasX = new boolean[m][n];

        prefix[0][0] = val(0, 0, grid[0][0]);
        hasX[0][0] = (grid[0][0] == 'X');

        for(int i = 1; i < n; i++) {
            prefix[0][i] = prefix[0][i-1]+val(0, i, grid[0][i]);
            hasX[0][i] = hasX[0][i-1] || (grid[0][i] == 'X');
        }

        for(int i = 1; i < m; i++) {
            prefix[i][0] = prefix[i-1][0]+val(i, 0, grid[i][0]);
            hasX[i][0] = hasX[i-1][0] || (grid[i][0] == 'X');
        }

        for(int i = 1; i < m; i++) {
            for(int j = 1; j < n; j++) {
                int top = prefix[i-1][j];
                int left = prefix[i][j-1];
                int topLeft = prefix[i-1][j-1];
                prefix[i][j] = val(i, j, grid[i][j])+top+left-topLeft;

                hasX[i][j] = (grid[i][j] == 'X') || hasX[i-1][j] || hasX[i][j-1];
            }
        }

        int ans = 0;
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(prefix[i][j] == 0 && hasX[i][j]) ans++;
            }
        }
        return ans;
    }
}