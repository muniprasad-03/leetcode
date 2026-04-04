// Last updated: 04/04/2026, 23:37:47
class Solution {
    public boolean helper(char[][] board,int r,int c,int idx,String word) {
        int rows = board.length;
        int cols = board[0].length;
        if(idx==word.length()) {
            return true;
        }
        if(r<0 || c<0 || r>=rows || c>=cols || board[r][c]=='*') {
            return false;
        }
        if(word.charAt(idx)==board[r][c]) {
            char ch = board[r][c];
            board[r][c] = '*'; 
            if( helper(board,r-1,c,idx+1,word) || 
                helper(board,r,c+1,idx+1,word) || 
                helper(board,r+1,c,idx+1,word) || 
                helper(board,r,c-1,idx+1,word) 
            )   return true;
            board[r][c] = ch;
        }
        return false;
    }
   public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        for(int r=0;r<m;r++) {
            for(int c=0;c<n;c++) {
                if(board[r][c]==word.charAt(0)) {
                    if(helper(board,r,c,0,word)) return true;
                }
            }
        }
        return false;
    }
}