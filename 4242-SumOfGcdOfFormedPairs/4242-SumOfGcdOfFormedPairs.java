// Last updated: 04/04/2026, 23:26:14
class Solution {
    private long GCD(long a, long b) {
        while(b != 0) {
            long temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }
    public long gcdSum(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        long[] arr = new long[n];
        for(int i=0;i<n;i++) {
            max = Math.max(max, nums[i]);
            arr[i] = GCD(nums[i], max);
        }
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length - 1;
        long ans = 0;
        while(left < right) {
            ans += GCD(arr[left++], arr[right--]);
        }
        return ans;
    }
}