// Last updated: 04/04/2026, 23:29:20
class Solution {
    public List<String> validStrings(int n) {
        List<String> ans = new ArrayList<>();
        char[] curr = new char[n];
        dfs(0, n, false, curr, ans);
        return ans;
    }

    private void dfs(int i, int n, boolean lastWasZero, char[] curr, List<String> ans) {
        if (i == n) {
            ans.add(new String(curr));
            return;
        }
        curr[i] = '1';
        dfs(i + 1, n, false, curr, ans);
        if (!lastWasZero) {
            curr[i] = '0';
            dfs(i + 1, n, true, curr, ans);
        }
    }
}
