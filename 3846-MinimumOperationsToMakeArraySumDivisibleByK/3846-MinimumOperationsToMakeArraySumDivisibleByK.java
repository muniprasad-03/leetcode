// Last updated: 04/04/2026, 23:28:59
class Solution {
    public int minOperations(int[] nums, int k) {
        int sum = 0;
        for(int num : nums) {
            sum += num;
        }
        return sum%k;
    }
}