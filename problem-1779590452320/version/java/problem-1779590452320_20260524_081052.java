// Last updated: 24/05/2026, 08:10:52
1class Solution {
2    public int passwordStrength(String password) {
3        HashSet<Character> set = new HashSet<>();
4        for(char ch : password.toCharArray()) {
5            set.add(ch);
6        }
7        int ans = 0;
8        for(char ch : set) {
9            if(ch >= 'a' && ch <= 'z') {
10                ans += 1;
11            } else if(ch >= 'A' && ch <= 'Z') {
12                ans += 2;
13            } else if(ch >= '0' && ch <= '9') {
14                ans += 3;
15            } else {
16                ans += 5;
17            }
18        }
19        return ans;
20    }
21}