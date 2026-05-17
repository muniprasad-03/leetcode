// Last updated: 17/05/2026, 14:28:18
1class Solution {
2    public boolean isAdjacentDiffAtMostTwo(String s) {
3        for(int i=1;i<s.length();i++) {
4            if(Math.abs(s.charAt(i) - s.charAt(i-1)) > 2) return false;
5        }
6        return true;
7    }
8}