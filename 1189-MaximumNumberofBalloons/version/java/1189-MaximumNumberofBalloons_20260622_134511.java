// Last updated: 22/06/2026, 13:45:11
1class Solution {
2    public int maxNumberOfBalloons(String text) {
3        int[] count = new int[26];
4        for(char ch : text.toCharArray()) {
5            count[ch - 'a']++;
6        }
7        count['l' - 'a'] /= 2;
8        count['o' - 'a'] /= 2;
9        int ans = Integer.MAX_VALUE;
10        for(char ch : "balloon".toCharArray()) {
11            ans = Math.min(ans, count[ch - 'a']);
12        }
13        return ans;
14    }
15}