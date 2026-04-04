// Last updated: 04/04/2026, 23:30:51
class Solution {
    public int n;
    public void swap(int[][] mat, int r1, int c1, int r2, int c2) {
        int temp = mat[r1][c1];
        mat[r1][c1] = mat[r2][c2];
        mat[r2][c2] = temp;
    }
    public void rotate(int[][] mat) {
        // Transpose
        for(int i=0;i<n;i++) {
            for(int j=i;j<n;j++) {
                swap(mat, i, j, j, i);
            }
        }
        // Row reverse
        for(int i=0;i<n;i++) {
            int s = 0, e = n-1;
            while(s < e) {
                swap(mat, i, s, i, e);
                s++; e--;
            }
        }
    }
    public boolean compare(int[][] mat1, int[][] mat2) {
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                if(mat1[i][j] != mat2[i][j]) return false;
            }
        }
        return true;
    }
    public boolean findRotation(int[][] mat, int[][] target) {
        this.n = mat.length;
        if(compare(mat, target)) return true;
        for(int i=0;i<3;i++) {
            rotate(mat);
            if(compare(mat, target)) return true;
        }
        return false;
    }
}