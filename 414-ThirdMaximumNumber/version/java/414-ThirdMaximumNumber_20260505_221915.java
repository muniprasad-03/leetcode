// Last updated: 05/05/2026, 22:19:15
1class Solution {
2    public int thirdMax(int[] nums) {
3        int n = nums.length;
4        Arrays.sort(nums);
5        HashSet<Integer> set = new HashSet<>();
6        for(int i=n-1;i>=0;i--) {
7            set.add(nums[i]);
8            if(set.size() == 3) return nums[i];
9        }
10        return nums[n-1];
11    }
12}