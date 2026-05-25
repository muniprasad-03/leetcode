// Last updated: 25/05/2026, 17:05:54
1class Solution {
2    public boolean canReach(String s, int minJump, int maxJump) {
3        int n = s.length();
4        int[] diff = new int[n + 1];
5        diff[0] = 1;
6        diff[1] = -1;
7        int reach = 0;
8        for(int i = 0; i < n; i++) {
9            reach += diff[i];
10            if(reach <= 0 || s.charAt(i) == '1')
11                continue;
12            if(i == n - 1)
13                return true;
14            int start = i + minJump;
15            int end = Math.min(i + maxJump, n - 1);
16            if(start < n) {
17                diff[start] += 1;
18                if(end + 1 < n)
19                    diff[end + 1] -= 1;
20            }
21        }
22        return false;
23    }
24}