// Last updated: 04/05/2026, 23:31:00
class Solution {
    public int[] findDegrees(int[][] matrix) {
        int n = matrix.length;
        int[] ans = new int[n];
        for(int i=0;i<n;i++) {
            int cnt = 0;
            for(int j=0; j<n; j++) {
                if(matrix[i][j] == 1) {
                    cnt++;
                }
            }
            ans[i] = cnt;
        }
        return ans;
    }
}