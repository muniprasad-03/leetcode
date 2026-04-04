// Last updated: 04/04/2026, 23:30:05
class Solution {
    private int GCD(int a,int b) {
        while(b != 0) {
            int rem = a%b;
            a = b;
            b = rem;
        }
        return a;
    }
    public int subarrayGCD(int[] nums, int k) {
        int n = nums.length;
        int ans = 0;
        for(int i=0;i<n;i++) {
            int gcd = 0;
            for(int j=i;j<n;j++) {
                gcd = GCD(gcd, nums[j]);
                if(gcd < k) break;
                if(gcd == k) ans++;
            }
        }
        return ans;
    }
}