// Last updated: 24/05/2026, 08:35:17
1class Solution {
2    public int minOperations(int[] nums) {
3        int n = nums.length;
4        int z = -1;
5        for(int i=0;i<n;i++) {
6            if(nums[i] == 0) {
7                z = i;
8                break;
9            }
10        }
11        boolean asc = true;
12        for(int i=0;i<n;i++) {
13            if(nums[i] !=(i - z + n) % n) {
14                asc = false;
15                break;
16            }
17        }
18        if(asc) {
19            return Math.min(z, 2 + Math.min(z, n - z));
20        }
21        boolean desc = true;
22        for(int i=0;i<n;i++) {
23            if(nums[i] !=(z - i + n) % n) {
24                desc = false;
25                break;
26            }
27        }
28        if(desc) {
29            return 1 + Math.min(z + 1, n - 1 - z);
30        }
31        return -1;
32    }
33}