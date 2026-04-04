// Last updated: 04/04/2026, 23:31:11
class Solution {
    public int numSpecial(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[] rowFreq = new int[m];
        int[] colFreq = new int[n];
        for(int i=0; i<m;i++) {
            for(int j=0;j<n;j++) {
                if(mat[i][j] == 1) {
                    rowFreq[i]++;
                    colFreq[j]++;
                }
            }
        }
        int count = 0;
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                if(mat[i][j] == 1 && rowFreq[i] == 1 && colFreq[j] == 1) {
                   count++;
                }
            }
        }
        return count;
    }
}