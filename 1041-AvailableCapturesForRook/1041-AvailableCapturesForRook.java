// Last updated: 04/04/2026, 23:32:18
class Solution {
    private int[] findRookPos(char[][] board) {
        for(int i=0;i<board.length;i++) {
            for(int j=0;j<board[0].length;j++) {
                if(board[i][j] == 'R') {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
    public int numRookCaptures(char[][] board) {
        int ans = 0;
        int m = board.length;
        int n = board[0].length;
        int[] pos = findRookPos(board);
        int row = pos[0], col = pos[1];

        int i = row-1;
        while(i>=0 && board[i][col]=='.') i--;
        if(i>=0 && board[i][col]=='p') ans++;

        i = row+1;
        while(i<m && board[i][col]=='.') i++;
        if(i<m && board[i][col]=='p') ans++;

        i = col-1;
        while(i>=0 && board[row][i]=='.') i--;
        if(i>=0 && board[row][i]=='p') ans++;

        i = col+1;
        while(i<n && board[row][i]=='.') i++;
        if(i<n && board[row][i]=='p') ans++;

        return ans;
    }
}