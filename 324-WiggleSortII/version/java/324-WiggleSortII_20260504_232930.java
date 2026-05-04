// Last updated: 04/05/2026, 23:29:30
1class Solution {
2    public void wiggleSort(int[] nums) {
3        int n = nums.length;
4        int[] map = new int[5001];
5        for(int num : nums) {
6            map[num]++;
7        }
8        int idx = 5000;
9        for(int i=1;i<n;i+=2) {
10            while(map[idx] == 0) idx--;
11            nums[i] = idx;
12            map[idx]--;
13        }
14        for(int i=0;i<n;i+=2) {
15            while(map[idx] == 0) idx--;
16            nums[i] = idx;
17            map[idx]--;
18        }
19    }
20}