// Last updated: 14/04/2026, 18:00:39
1class Solution {
2    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
3        int n = capacity.length;
4        int[] diff = new int[n];
5        for(int i=0;i<n;i++) {
6            diff[i] = capacity[i] - rocks[i];
7        }
8        Arrays.sort(diff);
9        int ans = 0;
10        for(int num : diff) {
11            if(additionalRocks - num >= 0) {
12                additionalRocks -= num;
13                ans++;
14            } else {
15                break;
16            }
17        }
18        return ans;
19    }
20}