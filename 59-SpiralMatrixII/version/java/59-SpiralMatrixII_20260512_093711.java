// Last updated: 12/05/2026, 09:37:11
1class Solution {
2    public int[][] generateMatrix(int n) {
3        int[][] matrix = new int[n][n];
4        int[] dirs = new int[]{0, 1, 0, -1, 0};
5        int row = 0, col = 0, dir = 0;
6        for(int num=1;num <= n*n;num++) {
7            matrix[row][col] = num;
8            int nextRow = row + dirs[dir];
9            int nextCol = col + dirs[dir+1];
10            if(nextRow < 0 || nextRow >= n ||
11                nextCol < 0 || nextCol >= n ||
12                matrix[nextRow][nextCol] != 0) {
13                dir =(dir + 1) % 4;
14            }
15            row += dirs[dir];
16            col += dirs[dir+1];
17        }
18        return matrix;
19    }
20}