// Last updated: 04/04/2026, 23:38:25
class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums) set.add(num);
        for(int i=1; i<=n; i++) {
            if(!set.contains(i)) return i;
        }
        return n+1;
    }
}