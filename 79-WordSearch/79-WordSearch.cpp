// Last updated: 04/04/2026, 23:37:42
class Solution {
public:
    bool helper(vector<vector<char>>& board,int r,int c,int idx,string& word) {
        int m = board.size();
        int n = board[0].size();
        if(idx==word.size()) return true;
        if(r<0 || c<0 || r>=m || c>=n || board[r][c]=='*') return false;
        if(word[idx]==board[r][c]) {
            char ch = board[r][c];
            board[r][c] = '*';
            if( helper(board,r-1,c,idx+1,word) ||
                helper(board,r,c+1,idx+1,word) ||
                helper(board,r+1,c,idx+1,word) ||
                helper(board,r,c-1,idx+1,word)
            ) return true;
            board[r][c] = ch;
        }
        return false;
    }
    bool exist(vector<vector<char>>& board, string word) {
        int m = board.size();
        int n = board[0].size();
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                if(helper(board,i,j,0,word)) {
                    return true;
                }
            }
        }
        return false;
    }
};