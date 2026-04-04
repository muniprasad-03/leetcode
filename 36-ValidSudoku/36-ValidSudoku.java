// Last updated: 04/04/2026, 23:38:30
class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++) {
            HashSet<Character> set = new HashSet<>();
            for(int j=0;j<9;j++) {
                char ch = board[i][j];
                if( ch != '.' && set.contains(ch)) {
                    return false;
                }
                set.add(ch);
            }
        }
        for(int i=0;i<9;i++) {
            HashSet<Character> set = new HashSet<>();
            for(int j=0;j<9;j++) {
                char ch = board[j][i];
                if(ch != '.' && set.contains(ch)) {
                    return false;
                }
                set.add(ch);
            }
        }
        for(int i=0;i<9;i+=3) {
            for(int j=0;j<9;j+=3) {
                HashSet<Character> set = new HashSet<>();
                for(int k=0;k<3;k++) {
                    for(int l=0;l<3;l++) {
                        char ch = board[i+k][j+l];
                        if(ch != '.' && set.contains(ch)) {
                            return false;
                        }
                        set.add(ch);
                    }
                }
            }
        }
        return true;
    }
}