// Last updated: 04/04/2026, 23:28:13
class Solution {
    public int evenNumberBitwiseORs(int[] nums) {
        int ans = 0;
        for(int num : nums) {
            if(num%2==0) ans |= num;
        }
        return ans;
    }
}