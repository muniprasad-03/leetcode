// Last updated: 04/04/2026, 23:29:18
class Solution {
    public int minimumOperations(int[] nums) {
        int ans = 0;
        for(int num : nums) {
            if(num%3 != 0) ans++;
        }
        return ans;
    }
}