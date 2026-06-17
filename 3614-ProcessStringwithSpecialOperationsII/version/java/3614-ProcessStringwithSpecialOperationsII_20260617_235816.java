// Last updated: 17/06/2026, 23:58:16
1class Solution {
2    public char processStr(String s, long k) {
3        long len = 0;
4        for(char ch : s.toCharArray()) {
5            if(ch == '*') {
6                if(len > 0) len--;
7            } else if(ch == '#') {
8                len *= 2;
9            } else if(ch == '%') {
10
11            } else {
12                len++;
13            }
14        }
15        if(k >= len) return '.';
16        for(int i = s.length() - 1; i >= 0; i--) {
17            char ch = s.charAt(i);
18            if(ch == '*') {
19                len++;
20            } else if(ch == '#') {
21                len = len / 2;
22                if(k >= len) k = k - len; 
23            } else if(ch == '%') {
24                k = len - k - 1;
25            } else {
26                len--;
27            }
28            if(k == len) {
29                return ch;
30            }
31        }
32        return '.';
33    }
34}