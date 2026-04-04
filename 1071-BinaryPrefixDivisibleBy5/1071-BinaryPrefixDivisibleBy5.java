// Last updated: 04/04/2026, 23:32:14
class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> ans = new ArrayList<>(nums.length);
        int val = 0;
        for(int bit : nums) {
            val = ((val<<1)+bit) % 5;
            ans.add(val==0);
        }
        return ans;
    }
}