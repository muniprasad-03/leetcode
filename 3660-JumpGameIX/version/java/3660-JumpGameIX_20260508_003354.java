// Last updated: 08/05/2026, 00:33:54
1class Solution {
2    public int[] maxValue(int[] nums) {
3        int n = nums.length;
4        int[] maxLeft = new int[n];
5        maxLeft[0] = nums[0];
6        for(int i = 1; i < n; i++) {
7            maxLeft[i] = Math.max(maxLeft[i-1], nums[i]);
8        }
9        int[] minRight = new int[n];
10        minRight[n-1] = nums[n-1];
11        for(int i = n - 2; i >= 0; i--) {
12            minRight[i] = Math.min(minRight[i+1], nums[i]);
13        }
14        int[] ans = new int[n];
15        ans[n-1] = maxLeft[n-1];
16        for(int i=n-2; i>=0; i--) {
17            if(maxLeft[i] <= minRight[i+1]) {
18                ans[i] = maxLeft[i];
19            } else {
20                ans[i] = ans[i+1];
21            }
22        }
23        return ans;
24    }
25}