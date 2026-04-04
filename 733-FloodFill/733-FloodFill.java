// Last updated: 04/04/2026, 23:33:16
class Solution {
    int m,n, color;
    private int[][] image;
    private boolean[][] vis;
    private void dfs(int row, int col, int pixel) {
        if(row<0 || row>=m || col<0 || col>=n || image[row][col] != pixel || vis[row][col]) {
            return;
        }
        vis[row][col] = true;
        image[row][col] = color;
        dfs(row-1, col, pixel);
        dfs(row+1, col, pixel);
        dfs(row, col-1, pixel);
        dfs(row, col+1, pixel);
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        this.m = image.length;
        this.n = image[0].length;
        this.color = color;
        this.image = image;
        this.vis = new boolean[m][n];
        dfs(sr, sc, image[sr][sc]);
        return image;
    }
}