// Last updated: 04/04/2026, 23:26:52
class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();
        int idx = n-1;
        while(idx>=0) {
            if(set.contains(nums[idx])) {
                break;
            }
            set.add(nums[idx]);
            idx--;
        }
        int eleToRem = idx+1;
        if(eleToRem == 0) return 0;
        return (eleToRem+2)/3;
    }
}