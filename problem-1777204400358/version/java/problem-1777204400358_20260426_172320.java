// Last updated: 26/04/2026, 17:23:20
1class Solution {
2    public int compareBitonicSums(int[] nums) {
3        long incSum = 0;
4        long decSum = 0;
5        int i=0;
6        int n = nums.length;
7        while(i + 1 < n && nums[i] < nums[i+1]) {
8            incSum += nums[i];
9            i++;
10        } 
11        i++;
12        while(i < n) {
13            decSum += nums[i];
14            i++;
15        } 
16        if(incSum > decSum) return 0;
17        else if(decSum > incSum) return 1;
18        return -1;
19    }
20}