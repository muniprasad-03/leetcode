// Last updated: 31/05/2026, 08:27:25
1class Solution {
2    public int maximumSaleItems(int[][] items, int budget) {
3        int n = items.length;
4        int[] freeCount = new int[n];
5        for(int i = 0; i < n; i++) {
6            int fi = items[i][0];
7            for(int j = 0; j < n; j++) {
8                if(i != j && items[j][0] % fi == 0) {
9                    freeCount[i]++;
10                }
11            }
12        }
13        int minPrice = Integer.MAX_VALUE;
14        for(int[] item : items) {
15            minPrice = Math.min(minPrice, item[1]);
16        }
17        int NEG = -1_000_000_000;
18        int[] dp = new int[budget + 1];
19        Arrays.fill(dp, NEG);
20        dp[0] = 0;
21        for(int i = 0; i < n; i++) {
22            int cost = items[i][1];
23            int val = 1 + freeCount[i];
24            for(int b = budget - cost; b >= 0; b--) {
25                if(dp[b] != NEG) {
26                    dp[b + cost] = Math.max(dp[b + cost], dp[b] +val);
27                }
28            }
29        }
30        int ans = budget / minPrice;
31        for(int spent = 0; spent <= budget; spent++) {
32            if(dp[spent] == NEG) continue;
33            int total = dp[spent] + (budget - spent) / minPrice;
34            ans = Math.max(ans, total);
35        }
36        return ans;
37    }
38}