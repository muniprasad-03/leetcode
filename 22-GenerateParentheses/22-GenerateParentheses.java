// Last updated: 04/04/2026, 23:38:46
class Solution {
    private int n;
    private void help(List<String> ans, StringBuilder str, int open, int close) {
        if(open > n || close>open) return;
        if(open == close && open == n) {
            ans.add(str.toString());
        }
        str.append('(');
        help(ans, str, open+1, close);
        str.deleteCharAt(str.length()-1);
        str.append(')');
        help(ans, str, open, close+1);
        str.deleteCharAt(str.length()-1);
    }
    public List<String> generateParenthesis(int n) {
        this.n = n;
        List<String> ans = new ArrayList<>();
        help(ans, new StringBuilder(), 0, 0);
        return ans;
    }
}