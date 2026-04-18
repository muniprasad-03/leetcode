// Last updated: 18/04/2026, 14:23:28
1class Solution {
2    private int reverse(int n) {
3        int rev = 0;
4        while(n!=0) {
5            rev = rev*10+(n%10);
6            n/=10;
7        }
8        return rev;
9    }
10    public int mirrorDistance(int n) {
11        return Math.abs(n-reverse(n));
12    }
13}