// Last updated: 04/04/2026, 23:31:45
class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int n = points.length;
        int ans = 0;
        for(int i=0;i<n-1;i++) {
            int a = Math.abs(points[i+1][0] - points[i][0]);
            int b = Math.abs(points[i+1][1] - points[i][1]);
            ans += Math.max(a, b);
        }
        return ans;
    }
}