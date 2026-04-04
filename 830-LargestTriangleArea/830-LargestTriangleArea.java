// Last updated: 04/04/2026, 23:32:55
class Solution {
    public double area(int[] pt1,int[] pt2,int[] pt3) {
        return 0.5 * Math.abs((double)pt1[0]*(pt2[1]-pt3[1]) + 
                pt2[0]*(pt3[1]-pt1[1]) + 
                pt3[0]*(pt1[1]-pt2[1]) );
    }
    public double largestTriangleArea(int[][] points) {
        int n = points.length;
        double ans = 0;
        for(int i=0;i<n-2;i++) {
            for(int j=i+1;j<n-1;j++) {
                for(int k=j+1;k<n;k++) {
                    double area = area(points[i],points[j],points[k]);
                    if(area>ans) ans = area;
                }
            }
        }
        return ans;
    }
}