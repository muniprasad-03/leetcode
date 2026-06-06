// Last updated: 06/06/2026, 14:52:40
1class Solution {
2    private Boolean[] dp;
3    private boolean solve(int idx, String s, HashSet<String> set) {
4        if(idx == s.length()) return true;
5        if(dp[idx] != null) return dp[idx];
6        StringBuilder word = new StringBuilder();
7        for(int i = idx ; i < s.length(); i++) {
8            word.append(s.charAt(i));
9            if(set.contains(word.toString()) && solve(i + 1, s, set)) {
10                return dp[i] = true;
11            }
12        }
13        return dp[idx] = false;
14    }
15    public boolean wordBreak(String s, List<String> wordDict) {
16        this.dp = new Boolean[s.length()];
17        HashSet<String> set = new HashSet<>(wordDict);
18        return solve(0, s, set);
19    }
20}