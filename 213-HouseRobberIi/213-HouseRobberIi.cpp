// Last updated: 04/04/2026, 23:35:50
class Solution {
public:
    int compute(const vector<int>& nums, int idx, int start, vector<int>& cache) {
        if (idx < start) return 0;
        if (idx == start) return nums[start];
        if (cache[idx - start] != -1) return cache[idx - start];

        int rob = nums[idx] + compute(nums, idx - 2, start, cache);
        int dontRob = compute(nums, idx - 1, start, cache);

        return cache[idx - start] = max(rob, dontRob);
    }

    int rob(vector<int>& nums) {
        int n = nums.size();
        if (n == 0) return 0;
        if (n == 1) return nums[0];
        if (n == 2) return max(nums[0], nums[1]);

        vector<int> cache1(n - 1, -1);
        int option1 = compute(nums, n - 2, 0, cache1);

        vector<int> cache2(n - 1, -1);
        int option2 = compute(nums, n - 1, 1, cache2);

        return max(option1, option2);
    }
};
