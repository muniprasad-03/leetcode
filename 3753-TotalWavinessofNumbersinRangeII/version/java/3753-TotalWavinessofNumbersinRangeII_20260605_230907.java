// Last updated: 05/06/2026, 23:09:07
1class Solution {
2    private Long[][][][][] dp;
3    private Long[][][][][] dpWays;
4
5    private long solve(String str, int idx, boolean isTight, boolean isLeadingZero, int prev, int prevPrev) {
6        if(idx == str.length()) {
7            return 0;
8        }
9
10        int tightIdx = isTight ? 1 : 0;
11        int zeroIdx = isLeadingZero ? 1 : 0;
12        if(dp[idx][tightIdx][zeroIdx][prev][prevPrev] != null) {
13            return dp[idx][tightIdx][zeroIdx][prev][prevPrev];
14        }
15
16        int limit = isTight ? str.charAt(idx) - '0' : 9;
17        long result = 0;
18        for(int digit = 0; digit <= limit; digit++) {
19            boolean newIsLeadingZero = isLeadingZero && (digit == 0);
20            boolean newTight = isTight && (digit == limit);
21
22            int newPrevPrev = newIsLeadingZero ? 10 : prev;
23            int newPrev = newIsLeadingZero ? 10 : digit;
24
25            long ways = countWays(str, idx + 1, newTight, newIsLeadingZero, newPrev, newPrevPrev);
26
27            if(!isLeadingZero && prev != 10 && prevPrev != 10) {
28                if((prev > prevPrev && prev > digit) || (prev < prevPrev && prev < digit)) {
29                    result += ways;
30                }
31            }
32
33            result += solve(str, idx + 1, newTight, newIsLeadingZero, newPrev, newPrevPrev);
34        }
35        return dp[idx][tightIdx][zeroIdx][prev][prevPrev] = result;
36    }
37
38    private long countWays(String str, int idx, boolean isTight, boolean isLeadingZero, int prev, int prevPrev) {
39        if(idx == str.length()) return 1;
40        
41        int tightIdx = isTight ? 1 : 0;
42        int zeroIdx = isLeadingZero ? 1 : 0;
43        if(dpWays[idx][tightIdx][zeroIdx][prev][prevPrev] != null) {
44            return dpWays[idx][tightIdx][zeroIdx][prev][prevPrev];
45        }
46
47        int limit = isTight ? str.charAt(idx) - '0' : 9;
48        long ways = 0;
49        
50        for(int digit = 0; digit <= limit; digit++) {
51            boolean newIsLeadingZero = isLeadingZero && (digit == 0);
52            boolean newTight = isTight && (digit == limit);
53            int newPrevPrev = newIsLeadingZero ? 10 : prev;
54            int newPrev = newIsLeadingZero ? 10 : digit;
55            
56            ways += countWays(str, idx + 1, newTight, newIsLeadingZero, newPrev, newPrevPrev);
57        }
58        return dpWays[idx][tightIdx][zeroIdx][prev][prevPrev] = ways;
59    }
60
61    public long totalWaviness(long num1, long num2) {
62        long left = (num1 <= 0) ? 0 : runFor(num1 - 1);
63        long right = runFor(num2);
64        return right - left;
65    }
66
67    private long runFor(long num) {
68        String str = String.valueOf(num);
69        int n = str.length();
70        dp = new Long[n][2][2][11][11];
71        dpWays = new Long[n][2][2][11][11];
72        return solve(str, 0, true, true, 10, 10);
73    }
74}