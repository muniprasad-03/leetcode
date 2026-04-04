// Last updated: 04/04/2026, 23:36:32
class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int ans = Integer.MIN_VALUE;
        for(int i=0;i<n;i++) {
            int product = 1;
            for(int j=i;j<n;j++) {
                product *= nums[j];
                if(ans < product) ans = product;
            }
        }
        return ans;
    }
}