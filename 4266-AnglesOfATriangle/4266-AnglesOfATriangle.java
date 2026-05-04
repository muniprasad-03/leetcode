// Last updated: 04/05/2026, 23:31:03
class Solution {
    public double[] internalAngles(int[] sides) {
        double a = sides[0];
        double b = sides[1];
        double c = sides[2];
        double[] ans = new double[0];
        if(a+b <= c || b+c <= a || c+a <= b) return ans;
        ans = new double[3];
        double cosA = (b * b + c * c - a * a) / (2*b*c);
        double cosB = (c * c + a * a - b * b) / (2*a*c);
        double cosC = (a * a + b * b - c * c) / (2*b*a);
        ans[0] = Math.toDegrees(Math.acos(cosA));
        ans[1] = Math.toDegrees(Math.acos(cosB));
        ans[2] = Math.toDegrees(Math.acos(cosC));
        Arrays.sort(ans);
        return ans;
    }
}