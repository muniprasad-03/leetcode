// Last updated: 04/05/2026, 17:20:42
1class Solution {
2    public void rotate(int[][] matrix) {
3        int n = matrix.length;
4        //Transpose first
5        for(int i = 0;i<n;i++) {
6            for(int j=0;j<i;j++) {
7                int temp = matrix[i][j];
8                matrix[i][j] = matrix[j][i];
9                matrix[j][i] = temp;
10            }
11        }
12        //Reverse each row then
13        for(int i=0;i<n;i++) {
14            for(int j=0;j<n/2;j++) {
15                int temp = matrix[i][j];
16                matrix[i][j] = matrix[i][n-j-1];
17                matrix[i][n-j-1] = temp;
18            }
19        }
20    }
21}