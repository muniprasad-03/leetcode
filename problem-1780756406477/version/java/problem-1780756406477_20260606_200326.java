// Last updated: 06/06/2026, 20:03:26
1class Solution {
2    public boolean consecutiveSetBits(int n) {
3        String s = Integer.toBinaryString(n);
4        int count = 0;
5        for(int i = 0; i < s.length() - 1; i++) {
6            if(s.charAt(i) == '1' && s.charAt(i + 1) == '1') count++;
7        }
8        return count == 1;
9    }
10}