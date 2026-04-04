// Last updated: 04/04/2026, 23:29:11
class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] ans = new int[2];
        int idx=0;
        Set<Integer> set = new HashSet<>();
        for(int num:nums) {
            if(set.contains(num)) {
                ans[idx++]=num;
            } else {
                set.add(num);
            }
        }
        return ans;
    }
}