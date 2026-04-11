// Last updated: 11/04/2026, 23:49:25
1class Solution {
2    public int countDigitOccurrences(int[] nums, int digit) {
3        int ans = 0;
4        for(int num : nums) {
5            while(num > 0) {
6                int dig = num % 10;
7                if(dig == digit) ans++;
8                num /= 10;
9            }
10        }
11        return ans;
12    }
13}