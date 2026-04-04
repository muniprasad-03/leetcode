// Last updated: 04/04/2026, 23:30:42
class Solution {
    public long maxMatrixSum(int[][] matrix) {
        int negCnt = 0;
        long sum = 0;
        int min = 100000;
        int n = matrix.length;
        int m = matrix[0].length;
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                int num = matrix[i][j];
                if(num < 0) negCnt++;
                int abs = Math.abs(num);
                min = Math.min(min, abs);
                sum += abs;
            }
        }
        if(negCnt%2 != 0) {
            sum -= (2L*min);
        }
        return sum;
    }
}