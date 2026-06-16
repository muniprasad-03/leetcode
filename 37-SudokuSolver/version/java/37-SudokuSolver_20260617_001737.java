// Last updated: 17/06/2026, 00:17:37
1class Solution {
2    private boolean isValid(char[][] board, int row, int col, char d) {
3        for(int i = 0; i < 9; i++) {
4            if(board[row][i] == d) return false;
5            if(board[i][col] == d) return false;
6        }
7        int boxRowSt = (row / 3) * 3;
8        int boxColSt = (col / 3) * 3;
9        for(int i = 0; i < 3; i++) {
10            for(int j = 0; j < 3; j++) {
11                if(board[boxRowSt + i][boxColSt + j] == d) return false;
12            }
13        }
14        return true;
15    }
16    private boolean solve(char[][] board) {
17        for(int i = 0; i < 9; i++) {
18            for(int j = 0; j < 9; j++) {
19                
20                if(board[i][j] == '.') {
21                    for(char d = '1'; d <= '9'; d++) {
22                        if(isValid(board, i, j, d)) {
23                            board[i][j] = d;
24                            if(solve(board)) {
25                                return true;
26                            }
27                            board[i][j] = '.';
28                        }
29                    }
30                    return false;
31                }
32                
33            }
34        }
35        return true;
36    }
37    public void solveSudoku(char[][] board) {
38        solve(board);
39    }
40}