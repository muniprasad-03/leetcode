// Last updated: 04/04/2026, 23:35:34
class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ans = new ArrayList<>();
        if (nums.length == 0) {
            return ans;
        }
        int left = 0;
        for (int right = 0; right < nums.length; right++) {
            if (right + 1 < nums.length && nums[right] + 1 == nums[right + 1]) {

            } else {
                if (left == right) {
                    ans.add(String.valueOf(nums[left]));
                } else {
                    ans.add(nums[left] + "->" + nums[right]);
                }
                left = right + 1;
            }
        }
        return ans;
    }
}