// Last updated: 04/04/2026, 23:30:41
class Solution {
    public String findDifferentBinaryString(String[] nums) {
        char[] ans = new char[nums.length];
        Arrays.fill(ans, '0');
        for(int i=0;i<nums.length;i++) {
            ans[i] = nums[i].charAt(i) == '0' ? '1' : '0';
        }
        return new String(ans);
    }
}