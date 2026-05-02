// Last updated: 02/05/2026, 21:35:03
1class Solution {
2    private boolean isGood(int num) {
3        boolean changed = false;
4        while(num > 0) {
5            int d = num % 10;
6            if(d == 3 || d == 4 || d == 7) return false;
7            if(d == 2 || d == 5 || d == 6 || d == 9) {
8                changed = true;
9            }
10            num /= 10;
11        }
12        return changed;
13    }
14    public int rotatedDigits(int n) {
15        int count = 0;
16        for(int i=1; i<=n; i++) {
17            if(isGood(i)) count++;
18        }
19        return count;
20    }
21}