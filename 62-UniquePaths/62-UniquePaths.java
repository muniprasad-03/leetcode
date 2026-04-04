// Last updated: 04/04/2026, 23:38:05
class Solution {
    public static int m;
    public static int n;
    public int[][] mem;
    public int help(int row,int col) {
        if(row<0 || col<0) return 0;
        if(row==0 && col==0) {
            return 1;
        }
        if(mem[row][col]!=0) return mem[row][col];
        int  fromLeft = help(row-1,col);
        int fromTop = help(row,col-1);
        mem[row][col] = fromLeft + fromTop;
        return mem[row][col];
    }
    public int uniquePaths(int m, int n) {
        this.m = m;
        this.n = n;
        this.mem = new int[m][n];
        return help(m-1,n-1);
    }
}