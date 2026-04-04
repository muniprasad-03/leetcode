// Last updated: 04/04/2026, 23:34:28
class Solution {
    private boolean possibleSum(int sum, int[] nums, int k) {
        int count = 1;
        int currSum = 0;
        for(int num : nums) {
            if(currSum+num <= sum) {
                currSum += num;
            } else {
                currSum = num;
                count++;
            }
            if(count > k) return false;
        }
        return true;
    }
    public int splitArray(int[] nums, int k) {
        int low = Integer.MIN_VALUE;
        int high = 0;
        int ans = Integer.MAX_VALUE;
        for(int num : nums) {
            low = Math.max(low, num);
            high += num;
        }
        while(low <= high) {
            int mid = low + (high-low)/2;
            if(possibleSum(mid, nums, k)) {
                ans = mid;
                high = mid-1;
            } else {
                low = mid+1;
            }
        }
        return ans;
    }
}