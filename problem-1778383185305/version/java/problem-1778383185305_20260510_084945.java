// Last updated: 10/05/2026, 08:49:45
1class Solution {
2    public long minArraySum(int[] nums) {
3        int max = 0;
4        for(int num : nums) {
5            max = Math.max(max, num);
6        }
7        boolean[] vis = new boolean[max+1];
8        for(int x : nums) vis[x] = true;
9        int[] best = new int[max+1];
10        Arrays.fill(best, Integer.MAX_VALUE);
11        for(int i=1;i<=max;i++) {
12            if(!vis[i]) continue;
13            for(int j=i;j<=max;j+=i) {
14                best[j] = Math.min(best[j], i);
15            }
16        }
17        long sum = 0;
18        for(int x : nums) sum += best[x];
19        return sum;
20    }
21}