// Last updated: 04/04/2026, 23:36:40
class Solution {
    private Set<String> set;
    private int n;
    private int[] memo = new int[301];
    private int solve(int idx, String str) {
        if(idx == n) return 1;
        if(memo[idx] != -1) return memo[idx];
        for(int i=idx+1; i<=n; i++) {
            String sub = str.substring(idx, i);
            if(set.contains(sub) && solve(i, str) == 1) {
                return memo[idx] = 1;
            }
        }
        return memo[idx] = 0;
    }
    public boolean wordBreak(String s, List<String> wordDict) {
        this.set = new HashSet<>(wordDict);
        Arrays.fill(this.memo, -1);
        this.n = s.length();
        return solve(0, s) == 1;
    }
}