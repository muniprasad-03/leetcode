// Last updated: 26/04/2026, 18:05:46
1class Solution {
2    private boolean check(int[] nums, int start, int end, int val) {
3        for(int i=start; i<= end; i++) {
4            if(nums[i] >= val) {
5                return false;
6            }
7        }
8        return true;
9    } 
10    public List<Integer> findValidElements(int[] nums) {
11        List<Integer> ans = new ArrayList<>();
12        int n = nums.length;
13        for(int i=0; i<n; i++) {
14            if(i == 0) {
15                ans.add(nums[i]);
16            } else if(i == n-1) {
17                ans.add(nums[i]);
18            } else if(check(nums, 0, i-1, nums[i]) || check(nums, i+1, n-1, nums[i])) {
19                ans.add(nums[i]);
20            }
21        }
22        return ans;
23    }
24}