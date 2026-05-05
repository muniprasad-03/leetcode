// Last updated: 05/05/2026, 10:13:50
1class Solution {
2    public int maxDepth(String s) {
3        int ans = 0;
4        int len = 0;
5        for(char ch : s.toCharArray()) {
6            if(ch == '(') {
7                len++;
8                ans = Math.max(ans, len);
9            } else if(ch == ')'){
10                len--;
11            }
12        }
13        return ans;
14    }
15}