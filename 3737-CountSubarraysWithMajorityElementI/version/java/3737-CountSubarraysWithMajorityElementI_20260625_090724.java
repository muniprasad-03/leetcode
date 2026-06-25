// Last updated: 25/06/2026, 09:07:24
1class Solution {
2    public int countMajoritySubarrays(int[] nums, int target) {
3        int n = nums.length;
4        int ans = 0;
5        for(int i = 0; i < n; i++) {
6            HashMap<Integer, Integer> map = new HashMap<>();
7            for(int j = i; j < n; j++) {
8                map.put(nums[j], map.getOrDefault(nums[j], 0) + 1);
9                if(map.containsKey(target) && map.get(target) > (j - i + 1) / 2) {
10                    ans++;
11                }
12            }
13        }
14        return ans;
15    }
16}