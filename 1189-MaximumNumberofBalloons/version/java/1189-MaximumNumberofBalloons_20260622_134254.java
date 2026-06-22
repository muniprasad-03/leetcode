// Last updated: 22/06/2026, 13:42:54
1class Solution {
2    public int maxNumberOfBalloons(String text) {
3        int[] count = new int[26];
4        for(char ch : text.toCharArray()) {
5            count[ch - 'a']++;
6        }
7        int ans = Integer.MAX_VALUE;
8        for(char ch : "balloon".toCharArray()) {
9            if(ch == 'l' || ch == 'o')
10                ans = Math.min(ans, count[ch - 'a'] / 2);
11            else 
12                ans = Math.min(ans, count[ch - 'a']);
13        }
14        return ans;
15    }
16}