// Last updated: 04/04/2026, 23:35:07
class Solution {
    public int findDuplicate(int[] nums) {
        int slow = 0;
        int fast = 0;
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while(slow != fast);
        fast = 0;
        while(slow!=fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
}