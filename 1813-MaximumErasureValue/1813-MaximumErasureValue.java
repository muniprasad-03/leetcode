// Last updated: 04/04/2026, 23:31:03
class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int[] freq = new int[10001]; // nums[i] <= 10^4
        int left = 0, right = 0, sum = 0, maxSum = 0;

        while (right < nums.length) {
            freq[nums[right]]++;
            sum += nums[right];

            while (freq[nums[right]] > 1) {
                freq[nums[left]]--;
                sum -= nums[left];
                left++;
            }

            maxSum = Math.max(maxSum, sum);
            right++;
        }

        return maxSum;
    }
}
