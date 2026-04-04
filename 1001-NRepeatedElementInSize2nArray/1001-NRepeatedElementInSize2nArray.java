// Last updated: 04/04/2026, 23:32:27
class Solution {
    public int repeatedNTimes(int[] nums) {
        boolean[] set = new boolean[10001];
        for(int num : nums) {
            if(set[num]) return num;
            set[num] = true;
        }
        return 0;
    }
}