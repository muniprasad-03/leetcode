// Last updated: 04/04/2026, 23:35:55
class Solution {
    public int compute(int[] nums, int idx, int start, int[] cache) {
        if (idx < start) return 0;
        if (idx == start) return nums[start];
        if (cache[idx - start] != -1) return cache[idx - start];

        int rob = nums[idx] + compute(nums, idx-2, start, cache);
        int dontRob = compute(nums, idx-1, start, cache);

        return cache[idx-start] = Math.max(rob, dontRob);
    }

    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0;
        if (n == 1) return nums[0];
        if (n == 2) return Math.max(nums[0], nums[1]);
        int[] cache1 = new int[n-1];
        Arrays.fill(cache1,-1);
        int option1 = compute(nums, n-2, 0, cache1);
        int[] cache2 = new int[n-1];
        Arrays.fill(cache2,-1);
        int option2 = compute(nums, n-1, 1, cache2);
        return Math.max(option1, option2);
    }
}
