// Last updated: 03/05/2026, 08:33:45
1class Solution {
2    public int[] minCost(int[] nums, int[][] queries) {
3        int n = nums.length;
4        int[] closest = new int[n];
5        for(int i = 0; i < n; i++) {
6            if(i == 0) {
7                closest[i] = 1;
8            } else if(i == n-1) {
9                closest[i] = n-2;
10            } else {
11                int leftDiff = nums[i]-nums[i-1];
12                int rightDiff = nums[i+1]-nums[i];
13
14                if(leftDiff <= rightDiff) {
15                    closest[i] = i-1;
16                } else {
17                    closest[i] = i+1;
18                }
19            }
20        }
21        long[] pref = new long[n];
22        for(int i = 0; i < n-1; i++) {
23            int cost;
24            if(closest[i] == i+1) {
25                cost = 1;
26            } else {
27                cost = nums[i+1]-nums[i];
28            }
29            pref[i+1] = pref[i]+cost;
30        }
31        long[] suff = new long[n];
32        for(int i = n-1; i > 0; i--) {
33            int cost;
34            if(closest[i] == i-1) {
35                cost = 1;
36            } else {
37                cost = nums[i]-nums[i-1];
38            }
39            suff[i-1] = suff[i]+cost;
40        }
41        int q = queries.length;
42        int[] ans = new int[q];
43        for(int i = 0; i < q; i++) {
44            int l = queries[i][0];
45            int r = queries[i][1];
46            if(l < r) {
47                ans[i] =(int)(pref[r]-pref[l]);
48            } else {
49                ans[i] =(int)(suff[r]-suff[l]);
50            }
51        }
52        return ans;
53    }
54}