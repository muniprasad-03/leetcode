// Last updated: 04/04/2026, 23:35:45
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> h = new HashSet<>();
        for(int i=0;i<nums.length;i++) {
            if(!h.add(nums[i])) {
                return true;
            }
        }
        return false;
    }
}