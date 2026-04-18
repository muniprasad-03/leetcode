// Last updated: 18/04/2026, 15:16:01
1class Solution {
2    public boolean isPrefixString(String str, String[] words) {
3        StringBuilder sb = new StringBuilder();
4        int n = str.length();
5        for(String s : words) {
6            sb.append(s);
7            if(sb.length() < n) continue;
8            else if(sb.length() > n) return false;
9            else return str.indexOf(sb.toString()) == 0;
10        }
11        return false;
12    }
13}