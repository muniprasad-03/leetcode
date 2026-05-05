// Last updated: 05/05/2026, 10:12:19
1class Solution {
2    public int maxDepth(String s) {
3        int ans = 0;
4        Stack<Character> st = new Stack<>();
5        for(char ch : s.toCharArray()) {
6            if(ch == '(') {
7                st.push(ch);
8                ans = Math.max(ans, st.size());
9            } else if(ch == ')'){
10                st.pop();
11            }
12        }
13        return ans;
14    }
15}