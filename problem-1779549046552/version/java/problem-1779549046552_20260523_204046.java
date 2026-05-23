// Last updated: 23/05/2026, 20:40:46
1class Solution {
2    public int minimumSwaps(int[] nums) {
3        int n = nums.length;
4        int zeroCnt = 0;
5        for(int num : nums) {
6            if(num == 0) {
7                zeroCnt++;
8            }
9        }
10        int swaps = 0;
11        for(int i = 0; i < n - zeroCnt; i++) {
12            if(nums[i] == 0) {
13                swaps++;
14            }
15        }
16        return swaps;
17    }
18}