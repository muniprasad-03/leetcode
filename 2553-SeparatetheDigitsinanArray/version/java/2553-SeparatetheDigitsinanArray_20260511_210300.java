// Last updated: 11/05/2026, 21:03:00
1class Solution {
2    public int[] separateDigits(int[] nums) {
3        StringBuilder str = new StringBuilder();
4        for(int num : nums) {
5            str.append(num);
6        }
7        int[] ans = new int[str.length()];
8        for(int i=0;i<str.length();i++) {
9            ans[i] = str.charAt(i) - '0';
10        }
11        return ans;
12    }
13}