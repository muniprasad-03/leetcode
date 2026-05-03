// Last updated: 03/05/2026, 08:04:22
1class Solution {
2    public int[] countOppositeParity(int[] nums) {
3        int n = nums.length;
4        int[] ans = new int[n];
5        for(int i=0;i<n;i++) {
6            int oddCnt = 0;
7            int evenCnt = 0;
8            for(int j=i+1;j<n;j++) {
9                if(nums[j] % 2 == 0) {
10                    evenCnt++;
11                } else {
12                    oddCnt++;
13                }
14            }
15            ans[i] = (nums[i] % 2 == 0) ? oddCnt : evenCnt;
16        }
17        return ans;
18    }
19}