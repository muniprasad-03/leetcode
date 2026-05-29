// Last updated: 29/05/2026, 09:41:40
1class Solution {
2    public int minElement(int[] nums) {
3        int ans = Integer.MAX_VALUE;
4        for(int num : nums) {
5            int sum = 0;
6            while(num > 0) {
7                sum += (num % 10);
8                num /= 10;
9            }
10            ans = Math.min(ans, sum);
11        }
12        return ans;
13    }
14}