// Last updated: 23/05/2026, 20:44:50
1class Solution {
2    public int minOperations(int[] nums, int k) {
3        int n = nums.length;
4        int ans = Integer.MAX_VALUE;
5        for(int x = 0; x < k; x++) {
6            for(int y = 0; y < k; y++) {
7                if(x == y) continue;
8                int ops = 0;
9                for(int i = 0; i < n; i++) {
10                    int rem = nums[i] % k;
11                    int target = (i % 2 == 0) ? x : y;
12                    int diff = Math.abs(rem - target);
13                    ops += Math.min(diff, k - diff);
14                }
15                ans = Math.min(ans, ops);
16            }
17        }
18        return ans;
19    }
20}