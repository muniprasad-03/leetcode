// Last updated: 04/04/2026, 23:33:22
class Solution {
    private int[] subsets;
    private int[] nums;
    private int k;
    private boolean backtrack(int idx, int target) {
        if(idx < 0) {
            return true;
        }
        for(int i=0;i<k;i++) {
            if(subsets[i] + nums[idx] <= target) {
                subsets[i] += nums[idx];
                if(backtrack(idx-1, target)) return true;
                subsets[i] -= nums[idx];
            } 
            if(subsets[i] == 0) break;
        }
        return false;
    }
    public boolean canPartitionKSubsets(int[] nums, int k) {
        int sum = 0;
        for(int num : nums) sum += num;
        if(sum % k != 0) return false;
        Arrays.sort(nums);
        this.nums = nums;
        this.k = k;
        int target = sum / k;
        this.subsets = new int[k];
        return backtrack(nums.length-1, target);
    }
}