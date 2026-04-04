// Last updated: 04/04/2026, 23:27:35
class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for(int num : nums) {
            if(num%k==0) set.add(num);
        }
        for(int i=k;;i+=k) {
            if(!set.contains(i)) return i;
        }
    }
}