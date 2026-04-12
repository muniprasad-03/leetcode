// Last updated: 12/04/2026, 08:21:47
1class Solution {
2    public double[] internalAngles(int[] sides) {
3        double a = sides[0];
4        double b = sides[1];
5        double c = sides[2];
6        double[] ans = new double[0];
7        if(a+b <= c || b+c <= a || c+a <= b) return ans;
8        ans = new double[3];
9        double cosA = (b * b + c * c - a * a) / (2*b*c);
10        double cosB = (c * c + a * a - b * b) / (2*a*c);
11        double cosC = (a * a + b * b - c * c) / (2*b*a);
12        ans[0] = Math.toDegrees(Math.acos(cosA));
13        ans[1] = Math.toDegrees(Math.acos(cosB));
14        ans[2] = Math.toDegrees(Math.acos(cosC));
15        Arrays.sort(ans);
16        return ans;
17    }
18}