// Last updated: 04/05/2026, 23:30:41
class Solution {
    private boolean check(int[] nums, int start, int end, int val) {
        for(int i=start; i<= end; i++) {
            if(nums[i] >= val) {
                return false;
            }
        }
        return true;
    } 
    public List<Integer> findValidElements(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int n = nums.length;
        for(int i=0; i<n; i++) {
            if(i == 0) {
                ans.add(nums[i]);
            } else if(i == n-1) {
                ans.add(nums[i]);
            } else if(check(nums, 0, i-1, nums[i]) || check(nums, i+1, n-1, nums[i])) {
                ans.add(nums[i]);
            }
        }
        return ans;
    }
}