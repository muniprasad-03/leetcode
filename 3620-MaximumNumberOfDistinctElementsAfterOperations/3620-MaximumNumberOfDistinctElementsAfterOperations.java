// Last updated: 04/04/2026, 23:29:06
class Solution {
    public int maxDistinctElements(int[] nums, int k) {
        Arrays.sort(nums);
        int ans = 0;
        int prevMin = Integer.MIN_VALUE;
        for(int num : nums) {
            int currMin = num - k;
            if(prevMin < currMin) {
                prevMin = num - k;
                ans++;
            } else if(prevMin < num + k) {
                prevMin++;
                ans++;
            }
        }
        return ans;
    }
}