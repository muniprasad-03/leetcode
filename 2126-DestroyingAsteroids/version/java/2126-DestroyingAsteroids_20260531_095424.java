// Last updated: 31/05/2026, 09:54:24
1class Solution {
2    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
3        Arrays.sort(asteroids);
4        long sum = mass;
5        for(int ast : asteroids) {
6            if(sum >= ast) {
7                sum += ast;
8            } else {
9                return false;
10            }
11        }
12        return true;
13    }
14}