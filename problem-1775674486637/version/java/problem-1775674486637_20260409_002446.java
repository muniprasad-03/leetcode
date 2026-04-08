// Last updated: 09/04/2026, 00:24:46
1class Solution {
2    public static int MOD = 1000000007;
3    public int xorAfterQueries(int[] nums, int[][] queries) {
4        for(int[] q : queries) {
5            int li = q[0];
6            int ri = q[1];
7            int ki = q[2];
8            int vi = q[3];
9            int idx = li;
10            while(idx <= ri) {
11                nums[idx] = (int)(((long)nums[idx] * vi) % MOD);
12                idx += ki;
13            }
14        }
15        int ans = nums[0];
16        for(int i=1;i<nums.length;i++) {
17            ans ^= nums[i];
18        }
19        return ans;
20    }
21}