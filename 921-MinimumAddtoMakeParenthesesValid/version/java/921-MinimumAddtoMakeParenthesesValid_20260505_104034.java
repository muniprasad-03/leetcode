// Last updated: 05/05/2026, 10:40:34
1class Solution {
2    public int minAddToMakeValid(String s) {
3        int open = 0;
4        Stack<Character> st = new Stack<>();
5        for(char ch : s.toCharArray()) {
6            if(ch == '(') {
7                st.push(ch);
8            } else {
9                if(!st.isEmpty() && st.peek() != ch) st.pop();
10                else st.push(ch);
11            }
12        }
13        return st.size();
14    }
15}