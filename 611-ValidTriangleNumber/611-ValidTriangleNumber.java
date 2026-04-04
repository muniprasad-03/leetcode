// Last updated: 04/04/2026, 23:33:42
class Solution {
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int ans = 0;
        for(int c=n-1;c >= 2;c--) {
            int a = 0;
            int b = c-1;
            while(a < b) {
                if(nums[a]+nums[b]>nums[c]) {
                    ans += (b-a);
                    b--;
                } else {
                    a++;
                }
            }
        }
        return ans;
    }
}