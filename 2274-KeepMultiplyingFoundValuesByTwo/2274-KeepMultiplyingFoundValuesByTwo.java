// Last updated: 04/04/2026, 23:30:31
class Solution {
    public int findFinalValue(int[] nums, int original) {
        boolean[] set = new boolean[2001];
        for(int num : nums) if(set[num]==false) set[num] = true;
        while(set[original]==true) original*=2;
        return original;
    }
}